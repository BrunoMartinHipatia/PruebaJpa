package com.example.pruebajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_dept")
    Long id_departamento;

    @Column(name="codigo")
    String codigo;

    @Column(name="dname")
    String nombre;

    @Column(name="loc")
    String localidad;

    @Column(name="numero")
    String numero;


}

