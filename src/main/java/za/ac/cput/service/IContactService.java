package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Contact;

import java.util.List;

@Service
public interface IContactService extends IService<Contact, Integer> {
    List<Contact> getAll();
}
