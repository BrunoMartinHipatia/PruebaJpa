package com.example.pruebajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Embeddable
public class Periodo {


    LocalDate fechaInicio;

    LocalDate fechaFin;


}
