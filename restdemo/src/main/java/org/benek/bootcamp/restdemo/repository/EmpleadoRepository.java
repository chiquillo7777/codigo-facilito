package org.benek.bootcamp.restdemo.repository;

import org.benek.bootcamp.restdemo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
