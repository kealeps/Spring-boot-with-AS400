package com.springbootwithas400.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(schema = "BANCYFILES", name = "CUMST")
public class Cliente implements Serializable {

    @Id
    @Column(name = "CUSCUN")
    private String id;

    @Column(name = "CUSNA1")
    private String nombre;

    @Column(name = "CUSIDN")
    private String cedula;

    @Column(name = "CUSIAD")
    private String correo;

    private static final long serialVersionUID = 1L;
}
