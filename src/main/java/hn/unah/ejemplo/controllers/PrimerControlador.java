package hn.unah.ejemplo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servicios")
public class PrimerControlador {
    

    @GetMapping("saludo/{nombre}/{apellido}")
    public String saludo(@PathVariable(name="nombre") String nombre,
                         @PathVariable(name="apellido") String apellido){
        return "Bienevenido " + nombre + " a Spring boot";
    }

    @GetMapping("/calculo")
    public String calculo(@RequestParam(name="operador") String operador,
                          @RequestParam(name="operando1") int operando1,
                          @RequestParam(name="operando2") int operando2){
        return "Operador: " + operador + "\noperando1: " + operando1 + "\noperando2: " + operando2;
    }


}
