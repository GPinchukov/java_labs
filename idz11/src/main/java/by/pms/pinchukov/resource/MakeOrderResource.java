package by.akarumey.project.resource;

import by.akarumey.project.bean.Order;
import by.akarumey.project.repository.ClientRepository;
import by.akarumey.project.repository.HotelRepository;
import by.akarumey.project.repository.OrderRepository;
import by.akarumey.project.repository.TourRepository;
import by.akarumey.project.service.PriceCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MakeOrderResource {

    private final TourRepository tourRepository;
    private final HotelRepository hotelRepository;
    private final OrderRepository orderRepository;
    private final ClientRepository clientRepository;
    private final PriceCalculatorService priceCalculatorService;

    @Autowired
    public MakeOrderResource(final TourRepository tourRepository,
                             final HotelRepository hotelRepository,
                             final OrderRepository orderRepository,
                             final ClientRepository clientRepository,
                             final PriceCalculatorService priceCalculatorService) {
        this.tourRepository = tourRepository;
        this.hotelRepository = hotelRepository;
        this.orderRepository = orderRepository;
        this.clientRepository = clientRepository;
        this.priceCalculatorService = priceCalculatorService;
    }

    @GetMapping("/make-order")
    public String all(final Model model) {
        model.addAttribute("tours", tourRepository.findAll());
        model.addAttribute("hotels", hotelRepository.findAll());
        return "/make-order";
    }

    @PostMapping("/make-order")
    public String buy(final Authentication authentication, @Valid final Order order) {
        if (order.getId() != null
                && !authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            orderRepository.findById(order.getId()).ifPresent(storedOrder -> {
                if (!storedOrder.getClient().getUsername().equals(authentication.getName())) {
                    throw new RuntimeException("User does not have rights to edit this order!");
                }
            });
        }


        order.setClient(clientRepository.findByUsername(authentication.getName()));
        order.setTour(tourRepository.findById(order.getTour().getId()).orElseThrow(RuntimeException::new));
        order.setHotel(hotelRepository.findById(order.getHotel().getId()).orElseThrow(RuntimeException::new));
        order.setPrice(priceCalculatorService.calculate(order));
        orderRepository.save(order);
        return "redirect:/orders";
    }

}
