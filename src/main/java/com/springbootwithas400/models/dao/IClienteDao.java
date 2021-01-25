package com.springbootwithas400.models.dao;

import com.springbootwithas400.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, String> {

    public Cliente findByCedula(String cedula);
}
