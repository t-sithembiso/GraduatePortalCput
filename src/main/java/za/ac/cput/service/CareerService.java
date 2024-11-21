package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Career;
import za.ac.cput.repository.CareerRepository;

import java.util.List;

@Service
public class CareerService implements ICareerService {

    @Autowired
    private CareerRepository repository;

    @Override
    public Career create(Career career) {
        return repository.save(career);
    }

    @Override
    public Career read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Career update(Career career) {
        if (repository.existsById(career.getCareerId())) {
            return repository.save(career);
        }
        return null;
    }

    @Override
    public List<Career> getAll() {
        return repository.findAll();
    }
}
