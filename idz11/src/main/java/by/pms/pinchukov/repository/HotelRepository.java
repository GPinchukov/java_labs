package by.akarumey.project.repository;

import by.akarumey.project.bean.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
