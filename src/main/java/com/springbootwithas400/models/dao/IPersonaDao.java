package com.springbootwithas400.models.dao;

import com.springbootwithas400.models.entity.Persona;

import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, String>{
    
}
