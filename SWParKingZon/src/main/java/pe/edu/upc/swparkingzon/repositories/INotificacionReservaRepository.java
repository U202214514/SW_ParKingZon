package pe.edu.upc.swparkingzon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzon.entities.NotificacionReserva;

@Repository
public interface INotificacionReservaRepository extends JpaRepository<NotificacionReserva, Integer> {
}
