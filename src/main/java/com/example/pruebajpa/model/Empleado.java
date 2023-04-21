    package com.example.pruebajpa.model;


    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.Generated;
    import lombok.NoArgsConstructor;

    import java.math.BigDecimal;
    import java.time.LocalDate;
    import java.util.Set;


    @Entity
    @Table(name="emp", indexes =  @Index(name = "ind_emp_ename", columnList = " ename"))
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Empleado {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id_emp")
        Long id_departamento;

        @Column(name="empno")
        String numero;

        @Column(name="ename")
        String nombre;

        @Column(name="job")
        String oficio;

        @Column(name="hiredate")
        LocalDate fechaContratacion;

        @ManyToOne
        @JoinColumn(name="mgr", foreignKey = @ForeignKey(name = "FK_emp_emp_mgr"))
        Empleado jefe;

        @Column(name="sal", precision = 7, scale = 2)
        BigDecimal salario;

        @Column(name="com", precision = 7, scale = 2)
        BigDecimal comision;

        @ManyToOne
        @JoinColumn(name="deptno", foreignKey = @ForeignKey(name = "FK_emp_dept_deptnor"))
        Departamento departamento;

        @ManyToMany
        @JoinTable(
                name = "emp_protectos",
                joinColumns = @JoinColumn(name = "id_emp"),
                inverseJoinColumns = @JoinColumn(name = "id_proy"))
        Set<Proyecto> listaProyectos;
    }