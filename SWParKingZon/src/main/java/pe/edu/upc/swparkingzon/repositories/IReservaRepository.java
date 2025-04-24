package pe.edu.upc.swparkingzon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzon.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

}
