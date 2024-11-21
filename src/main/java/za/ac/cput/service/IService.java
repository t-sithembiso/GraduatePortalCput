package za.ac.cput.service;

import org.springframework.stereotype.Service;

@Service
public interface IService<T, PKey> {
    T create(T obj);

    T read(PKey pKey);

    T update(T obj);
}
