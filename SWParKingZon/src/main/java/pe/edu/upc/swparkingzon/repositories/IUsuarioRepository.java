package pe.edu.upc.swparkingzon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzon.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("Select u from Usuario u where u.nombre like %:nNombre%")
    public List<Usuario> buscarNombre(@Param("nNombre")String nNombre);
}
