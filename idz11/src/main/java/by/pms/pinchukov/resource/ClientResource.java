package by.akarumey.project.resource;

import by.akarumey.project.bean.Client;
import by.akarumey.project.bean.Role;
import by.akarumey.project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import static java.util.Collections.singletonList;

@Controller
public class ClientResource {

    private final PasswordEncoder passwordEncoder;
    private final ClientRepository clientRepository;

    @Autowired
    public ClientResource(final PasswordEncoder passwordEncoder, final ClientRepository clientRepository) {
        this.passwordEncoder = passwordEncoder;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients")
    public String all(final Model model) {
        return allClients(model);
    }

    @PostMapping("/clients")
    public String save(final Model model, @Valid final Client client) {
        populateClient(client);
        clientRepository.save(client);
        return allClientsRedirect(model);
    }

    @PostMapping("/clients/{id}")
    public String delete(final Model model, @PathVariable final Long id) {
        clientRepository.deleteById(id);
        return allClientsRedirect(model);
    }

    private String allClients(final Model model) {
        clientRepository.flush();
        model.addAttribute("clients", clientRepository.findAll());
        return "/clients";
    }

    private String allClientsRedirect(final Model model) {
        return "redirect:" + allClients(model);
    }

    private void populateClient(final Client client) {
        if (client.getId() == null) {
            client.setAuthorities(singletonList(Role.builder().name("ROLE_USER").build()));
        }
        client.setPassword(passwordEncoder.encode(client.getPassword()));
    }

}
