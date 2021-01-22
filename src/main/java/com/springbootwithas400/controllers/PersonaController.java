package com.springbootwithas400.controllers;

import java.util.List;


import com.springbootwithas400.models.entity.Persona;
import com.springbootwithas400.models.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    public IPersonaService personaService;

    @GetMapping("/listar")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona findById(@PathVariable String id){
        return personaService.findById(id);
    }
    @PostMapping("/save")
    public Persona save(@PathVariable Persona persona){

        
        Persona newPersona = null;
        newPersona = personaService.save(persona);
       return newPersona;
    }

    @DeleteMapping("/persona/{id}")
    public void delete(String id){
        personaService.delete(id);
    }

    @PutMapping("/{persona}")
    public Persona update(@PathVariable String id, Persona persona){
        Persona currentPersona = this.personaService.findById(id);
        Persona personaUpdated = null;
        try {
            currentPersona.setNombre(persona.getNombre());
            currentPersona.setApellido(persona.getApellido());
            currentPersona.setEmail(persona.getEmail());
            personaUpdated = this.personaService.save(currentPersona);
        } catch (Exception e) {
           
        }
        return personaUpdated;
        
    }
    
}
