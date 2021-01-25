package com.springbootwithas400.models.service;

import java.util.List;

import com.springbootwithas400.models.dao.IPersonaDao;

import com.springbootwithas400.models.entity.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public Persona findById(String id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public void delete(String id) {
        personaDao.deleteById(id);

    }

}
