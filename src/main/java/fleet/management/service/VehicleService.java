package fleet.management.service;

import fleet.management.model.Vehicle;
import fleet.management.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public List<Vehicle> getAll() {
        return repository.findAll();
    }

    public Optional<Vehicle> getById(Long id) {
        return repository.findById(id);
    }

    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
