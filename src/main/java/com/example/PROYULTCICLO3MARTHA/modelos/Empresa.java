package com.example.PROYULTCICLO3MARTHA.modelos;

import javax.persistence.*;


@Entity
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String direccion;
    private String telefono;
    private String NIT;

    public Empresa() {
    }

    public Empresa(String name, String direccion, String telefono, String NIT) {
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
