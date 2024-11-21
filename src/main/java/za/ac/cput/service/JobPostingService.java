package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.JobPosting;
import za.ac.cput.repository.JobPostingRepository;

import java.util.List;

@Service
public class JobPostingService implements IJobPostingService {

    @Autowired
    private JobPostingRepository repository;

    @Override
    public JobPosting create(JobPosting jobPosting) {
        return repository.save(jobPosting);
    }

    @Override
    public JobPosting read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public JobPosting update(JobPosting jobPosting) {
        if (repository.existsById(jobPosting.getJobId())) {
            return repository.save(jobPosting);
        }
        return null;
    }


    @Override
    public List<JobPosting> getAll() {
        return repository.findAll();
    }
}
