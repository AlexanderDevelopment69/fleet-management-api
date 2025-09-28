package fleet.management.service;

import fleet.management.model.Driver;
import fleet.management.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private final DriverRepository repository;

    public DriverService(DriverRepository repository) {
        this.repository = repository;
    }

    public List<Driver> getAll() {
        return repository.findAll();
    }

    public Optional<Driver> getById(Long id) {
        return repository.findById(id);
    }

    public Driver save(Driver driver) {
        return repository.save(driver);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
