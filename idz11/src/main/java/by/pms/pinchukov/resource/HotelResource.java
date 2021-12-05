package by.akarumey.project.resource;

import by.akarumey.project.bean.Hotel;
import by.akarumey.project.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HotelResource {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelResource(final HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    public String all(final Model model) {
        return allHotels(model);
    }

    @PostMapping("/hotels")
    public String save(final Model model, @Valid final Hotel hotel) {
        hotelRepository.save(hotel);
        return allHotelsRedirect(model);
    }

    @PostMapping("/hotels/{id}")
    public String delete(final Model model, @PathVariable final Long id) {
        hotelRepository.deleteById(id);
        return allHotelsRedirect(model);
    }

    private String allHotels(final Model model) {
        hotelRepository.flush();
        model.addAttribute("hotels", hotelRepository.findAll());
        return "/hotels";
    }

    private String allHotelsRedirect(final Model model) {
        return "redirect:" + allHotels(model);
    }

}
