package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.JobPosting;

import java.util.List;

@Service
public interface IJobPostingService extends IService<JobPosting, Integer> {
    List<JobPosting> getAll();
}
