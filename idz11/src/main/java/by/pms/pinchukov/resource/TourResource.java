package by.akarumey.project.resource;

import by.akarumey.project.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TourResource {

    private final TourRepository tourRepository;

    @Autowired
    public TourResource(final TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @GetMapping("/tours")
    public String all(final Model model) {
        return allTours(model);
    }

    @PostMapping("/tours")
    public String save(final Model model, @Valid final by.akarumey.project.bean.Tour tour) {
        tourRepository.save(tour);
        return allToursRedirect(model);
    }

    @PostMapping("/tours/{id}")
    public String delete(final Model model, @PathVariable final Long id) {
        tourRepository.deleteById(id);
        return allToursRedirect(model);
    }

    private String allTours(final Model model) {
        tourRepository.flush();
        model.addAttribute("tours", tourRepository.findAll());
        return "/tours";
    }

    private String allToursRedirect(final Model model) {
        return "redirect:" + allTours(model);
    }

}
