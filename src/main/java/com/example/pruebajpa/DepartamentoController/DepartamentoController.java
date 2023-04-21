package com.example.pruebajpa.DepartamentoController;

import com.example.pruebajpa.model.Departamento;
import com.example.pruebajpa.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository departamentoRepositorio;

    @GetMapping("listado")
    public ModelAndView listado(){

        List<Departamento> listaDepartamentos = departamentoRepositorio.findAllByLocalidad("madrid");
        System.out.println(listaDepartamentos);
        ModelAndView mAV = new ModelAndView();
        mAV.setViewName("departamento/listado");
        return mAV;
    }

    @GetMapping("alta")
    public ModelAndView alta(@RequestParam String codigo, @RequestParam String nombre){
        Departamento d = new Departamento();
        d.setCodigo(codigo);
        d.setNombre(nombre);
        departamentoRepositorio.save(d);


        List<Departamento> listaDepartamentos = departamentoRepositorio.findAll();
        System.out.println(listaDepartamentos);
        ModelAndView mAV = new ModelAndView();
        mAV.setViewName("departamento/listado");
        return mAV;
    }
    @GetMapping("baja")
    public ModelAndView baja(@RequestParam long id_departamento){
        Departamento d = new Departamento();

        d.setId_departamento(1L);

        departamentoRepositorio.deleteById(d.getId_departamento());


        List<Departamento> listaDepartamentos = departamentoRepositorio.findAll();
        System.out.println(listaDepartamentos);
        ModelAndView mAV = new ModelAndView();
        mAV.setViewName("departamento/listado");
        return mAV;
    }
}
//http://localhost:8080/departamento/alta?codigo=50&nombre=bruno