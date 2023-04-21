package com.example.pruebajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="proy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proy")
    Long id_proy;

    String numero;

    String nombre;
    @Embedded
    Periodo periodo;

    @ManyToMany(mappedBy = "listaProyectos")
    Set<Empleado> listaEmpleados;
}

