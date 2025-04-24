package pe.edu.upc.swparkingzon.servicesinterfaces;


import pe.edu.upc.swparkingzon.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol r);
    public Rol listId(int idRol);
    public void update(Rol r);
    public void delete(int idRol);
}
