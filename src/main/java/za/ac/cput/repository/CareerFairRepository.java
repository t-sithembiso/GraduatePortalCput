package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.CareerFair;

@Repository
public interface CareerFairRepository extends JpaRepository<CareerFair, Integer> {
    CareerFair findByEventName(String name);
}
