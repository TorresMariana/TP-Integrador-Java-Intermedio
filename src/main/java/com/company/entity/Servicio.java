package com.company.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


    // Constructor
    public Servicio() {
    }

    public Servicio(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }


    // Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    // ToString

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
