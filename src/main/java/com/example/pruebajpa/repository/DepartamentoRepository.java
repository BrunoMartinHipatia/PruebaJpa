package com.example.pruebajpa.repository;

import com.example.pruebajpa.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    List<Departamento> findAllByNombreAndCodigoOrderByCodigo(String nombre, String localidad);

    List<Departamento> findAllByCodigo(String codigo);

    List<Departamento> findAllByNombre(String nombre);

    List<Departamento> findAllByLocalidad(String localidad);

    List<Departamento> findAllByNombreContaining(String nombre);
    List<Departamento> findAllByNombreIsContaining(String localidad);
    List<Departamento> findAllByNombreContains(String localidad);



}
