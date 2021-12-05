package by.akarumey.project.repository;

import by.akarumey.project.bean.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Long> {
}
