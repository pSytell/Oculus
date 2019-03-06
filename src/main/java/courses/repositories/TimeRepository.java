package courses.repositories;

import courses.entity.Times;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Times,Integer> {
}
