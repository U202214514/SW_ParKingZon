package pe.edu.upc.swparkingzon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzon.entities.Rol;

@Repository

public interface IRolRepository extends JpaRepository<Rol,Integer> {
}
