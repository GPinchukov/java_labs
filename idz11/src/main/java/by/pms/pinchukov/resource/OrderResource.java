package by.akarumey.project.resource;

import by.akarumey.project.repository.ClientRepository;
import by.akarumey.project.repository.HotelRepository;
import by.akarumey.project.repository.OrderRepository;
import by.akarumey.project.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderResource {

    private final OrderRepository orderRepository;
    private final HotelRepository hotelRepository;
    private final TourRepository tourRepository;
    private final ClientRepository clientRepository;

    @Autowired
    public OrderResource(final OrderRepository orderRepository,
                         final HotelRepository hotelRepository,
                         final TourRepository tourRepository,
                         final ClientRepository clientRepository) {
        this.orderRepository = orderRepository;
        this.hotelRepository = hotelRepository;
        this.tourRepository = tourRepository;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/orders")
    public String all(final Model model, final Authentication authentication) {
        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            model.addAttribute("orders", orderRepository.findAll());
        } else {
            final Long clientId = clientRepository.findByUsername(authentication.getName()).getId();
            model.addAttribute("orders", orderRepository.findByClientId(clientId));
        }

        model.addAttribute("hotels", hotelRepository.findAll());
        model.addAttribute("tours", tourRepository.findAll());
        return "/orders";
    }

    @PostMapping("/orders/{id}")
    public String delete(final Model model, final Authentication authentication, @PathVariable final Long id) {
        orderRepository.findById(id).ifPresent(storedOrder -> {
            if (!storedOrder.getClient().getUsername().equals(authentication.getName())
                    && !authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
                throw new RuntimeException("You do not have enough permissions to do this");
            }
        });

        orderRepository.deleteById(id);
        orderRepository.flush();
        return "redirect:" + all(model, authentication);
    }

}
