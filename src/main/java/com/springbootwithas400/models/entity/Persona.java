package com.springbootwithas400.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(schema="BANAMO77", name = "PERSONA")
public class Persona {
    
    @Id
    @Column(name = "ID_PERSONA")
    private String id;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "EMAIL")
    private String email;


    @Column(name = "TELEFONO")
    private String telefono;
}
