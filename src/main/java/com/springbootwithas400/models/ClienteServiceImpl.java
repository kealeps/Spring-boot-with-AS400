package com.springbootwithas400.models;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.springbootwithas400.models.dao.IClienteDao;
import com.springbootwithas400.models.entity.Cliente;
import com.springbootwithas400.models.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente findByCedula(String cedula) {
      
        return clienteDao.findByCedula(cedula);
    }




 
}
