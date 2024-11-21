package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.JobPosting;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting,Integer > {
}
