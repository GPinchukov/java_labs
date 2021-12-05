package by.akarumey.project.repository;

import by.akarumey.project.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByUsername(final String username);

}
