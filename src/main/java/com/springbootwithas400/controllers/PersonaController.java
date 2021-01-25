package com.springbootwithas400.controllers;

import java.util.List;

import com.springbootwithas400.models.entity.Persona;
import com.springbootwithas400.models.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    public IPersonaService personaService;

    @GetMapping("/listar")
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona findById(@PathVariable String id) {
        return personaService.findById(id);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        personaService.delete(id);
    }

    @PutMapping("/{persona}")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona update(@RequestBody Persona persona, @PathVariable String id) {
        Persona currentPersona = personaService.findById(id);

        currentPersona.setNombre(persona.getNombre());
        currentPersona.setApellido(persona.getApellido());
        currentPersona.setEmail(persona.getEmail());

        try {
            return personaService.save(currentPersona);
        } catch (Exception e) {
            return null;
        }

    }

}
