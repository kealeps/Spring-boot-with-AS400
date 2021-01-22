package com.springbootwithas400.models.service;

import java.util.List;

import com.springbootwithas400.models.entity.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll();

    public Cliente findByCedula(String cedula);
}
