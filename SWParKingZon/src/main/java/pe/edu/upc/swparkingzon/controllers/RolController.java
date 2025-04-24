package pe.edu.upc.swparkingzon.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.swparkingzon.dtos.RolDTO;
import pe.edu.upc.swparkingzon.entities.Rol;
import pe.edu.upc.swparkingzon.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rS;

    @GetMapping
    public List<RolDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RolDTO dto){
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @GetMapping("/{idRol}")
    public RolDTO buscarId(@PathVariable("idRol") int idRol){
        ModelMapper m = new ModelMapper();
        RolDTO dto=m.map(rS.listId(idRol), RolDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto){
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.update(r);
    }
    @DeleteMapping("/{idRol}")
    public void eliminar(@PathVariable("idRol") int idRol){rS.delete(idRol);
    }

}
