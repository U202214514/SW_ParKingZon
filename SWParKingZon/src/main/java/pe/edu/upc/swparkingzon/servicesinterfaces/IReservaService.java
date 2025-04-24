package pe.edu.upc.swparkingzon.servicesinterfaces;

import pe.edu.upc.swparkingzon.entities.Reserva;

import java.util.List;

public interface IReservaService {

    public List<Reserva> list();
    public void insert(Reserva reserva);
    public Reserva listId(int id);
    public void update(Reserva reserva);
    public void delete(int id);
}
