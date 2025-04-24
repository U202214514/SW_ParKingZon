package pe.edu.upc.swparkingzon.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzon.entities.Estacionamiento;
import pe.edu.upc.swparkingzon.repositories.IEstacionamientoRepository;
import pe.edu.upc.swparkingzon.servicesinterfaces.IEstacionamientoService;

import java.util.List;

@Service
public class EstacionamientoSeviceImplement implements IEstacionamientoService {

    @Autowired
    private IEstacionamientoRepository uR;

    @Override
    public List<Estacionamiento> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Estacionamiento e) {
        uR.save(e);
    }

    @Override
    public Estacionamiento listId(int id) {
        return uR.findById(id).orElse(new Estacionamiento());
    }

    @Override
    public void update(Estacionamiento e) {
        uR.save(e);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }
}
