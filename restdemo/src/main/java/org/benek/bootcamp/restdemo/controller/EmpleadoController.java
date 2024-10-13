package org.benek.bootcamp.restdemo.controller;

import org.benek.bootcamp.restdemo.model.Empleado;
import org.benek.bootcamp.restdemo.repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    private final EmpleadoRepository repository;

    public EmpleadoController(EmpleadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/empleados")
    public List<Empleado> all(){
        return repository.findAll();
    }

    @GetMapping("/empleados/{id}")
    public Empleado getEmpleado(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el id de la empleado: " + id));
    }

    @PostMapping("/empleados")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return repository.save(empleado);
    }

    @PutMapping("/empleados/{id}")
    public Empleado updateEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoActualizado){
        return repository.findById(id)
                .map(empleado -> {
                   empleado.setNombre(empleadoActualizado.getNombre());
                   empleado.setPuesto(empleadoActualizado.getPuesto());
                   return repository.save(empleado);
                })
                .orElseGet(()->{
                    return repository.save(empleadoActualizado);
                });
    }

    @DeleteMapping("/empleados/{id}")
    public void deleteEmpleado(@PathVariable Long id){
        repository.deleteById(id);
    }
}
