package com.springbootwithas400.models.service;

import java.util.List;


import com.springbootwithas400.models.entity.Persona;

public interface IPersonaService {
    
    public List<Persona> findAll();

    public Persona findById(String id);

    public Persona save(Persona persona);

    public void delete(String id);

   
}
