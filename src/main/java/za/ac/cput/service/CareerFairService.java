package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.CareerFair;
import za.ac.cput.repository.CareerFairRepository;

import java.util.List;

@Service
public class CareerFairService implements ICareerFairService {
    private final CareerFairRepository careerFairRepository;

    @Autowired
    public CareerFairService(CareerFairRepository careerFairRepository) {
        this.careerFairRepository = careerFairRepository;
    }

    @Override
    public CareerFair saveFair(CareerFair careerFair) {
        return careerFairRepository.save(careerFair);
    }

    @Override
    public CareerFair updateFair(CareerFair careerFair) {
        return careerFairRepository.save(careerFair);
    }

    @Override
    public List<CareerFair> findAllFair() {
        return careerFairRepository.findAll();
    }

    @Override
    public CareerFair findFairByName(String name) {
        return careerFairRepository.findByEventName(name);
    }
}
