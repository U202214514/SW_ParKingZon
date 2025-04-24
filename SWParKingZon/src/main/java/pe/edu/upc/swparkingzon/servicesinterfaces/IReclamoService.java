package pe.edu.upc.swparkingzon.servicesinterfaces;

import pe.edu.upc.swparkingzon.entities.Reclamo;

import java.util.List;

public interface IReclamoService {
    public List<Reclamo> list();
    public void insert(Reclamo rm);
    public Reclamo listId(int id);
    public void update(Reclamo rm);
    public void delete(int id);
}
