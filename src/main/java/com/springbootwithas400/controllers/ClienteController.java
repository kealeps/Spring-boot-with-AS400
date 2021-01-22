package com.springbootwithas400.controllers;

import com.springbootwithas400.models.entity.Cliente;
import com.springbootwithas400.models.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/cliente/{cedula}")
   public Cliente findByCedula(@PathVariable String cedula){

    return clienteService.findByCedula(cedula);
   }

   @GetMapping("/hola")
   public String Hola(){
       return "hola";
   }
}
