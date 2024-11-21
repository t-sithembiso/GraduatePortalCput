package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;

import java.util.List;

@Service
public interface IAddressService extends IService<Address, Integer> {
    List<Address> getAll();
}
