package com.springboottest.restdemo2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Empleado {

    @Id @GeneratedValue
    private Long id;
    private String nombre;
    private String puesto;


    public Empleado(String javier, String cto) {
    }
}
