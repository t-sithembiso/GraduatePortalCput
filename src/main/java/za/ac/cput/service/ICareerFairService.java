package za.ac.cput.service;

import za.ac.cput.domain.CareerFair;

import java.util.List;

public interface ICareerFairService {
    CareerFair saveFair(CareerFair careerFair);
    CareerFair updateFair(CareerFair careerFair);
    List<CareerFair> findAllFair();
    CareerFair findFairByName(String name);
}
