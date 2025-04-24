package pe.edu.upc.swparkingzon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzon.entities.Empresa;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Integer> {
}
