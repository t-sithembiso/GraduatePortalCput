package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Career;

import java.util.List;

@Service
public interface ICareerService extends IService<Career, Integer> {
    List<Career> getAll();
}
