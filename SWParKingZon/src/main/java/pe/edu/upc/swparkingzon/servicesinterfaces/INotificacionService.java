package pe.edu.upc.swparkingzon.servicesinterfaces;

import pe.edu.upc.swparkingzon.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();
    public void insert(Notificacion n);
    public Notificacion listId(int id);
    public void update(Notificacion n);
    public void delete(int id);
}
