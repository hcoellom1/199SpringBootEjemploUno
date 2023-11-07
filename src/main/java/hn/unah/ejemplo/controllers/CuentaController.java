package hn.unah.ejemplo.controllers;

import java.util.LinkedList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.ejemplo.dto.Cuenta;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    private List<Cuenta> listaCuentas = new LinkedList<Cuenta>();

    @GetMapping("/info")
    public String crearCuenta(@RequestBody Cuenta cuenta){
        this.listaCuentas.add(cuenta);
        return cuenta.toString();
    } 

    //Endpoint de acceso: localhost:8080/api/cuentas/buscarcuenta 
    @GetMapping("/buscarcuenta")
    public Cuenta buscarCuenta(@RequestParam(name="cuenta") int cuenta){
        for (Cuenta actual : listaCuentas) {
            if(actual.getNumero() == cuenta){
                return actual;
            }
        }
        return null;
 
    }
    
}
