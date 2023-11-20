package com.company.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class AreaComercial {


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Cliente cliente;


    /*
    @OneToMany(mappedBy = "areaComercial", fetch = FetchType.EAGER)
    private List<Cliente> clientes = new ArrayList<>();
     */



    // Constructor
    public AreaComercial() {
    }

    public AreaComercial(Cliente cliente) {
        this.cliente = cliente;
    }


    // Setter y getter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // ToString
    @Override
    public String toString() {
        return "AreaComercial{" +
                "clientes=" + cliente +
                '}';
    }


    // Métodos (posteriormente se pasaran a service)
    public void agregarCliente(Cliente cliente) {
        //clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        //clientes.remove(cliente);
    }

    public void realizarAltaCliente(Cliente cliente) {
        // Lógica para dar de alta a un técnico
    }

    public void realizarBajaCliente(Cliente cliente) {
        // Lógica para dar de baja a un técnico
    }

    public void realizarModificacionCliente(Cliente cliente) {
        // Lógica para modificar datos de un técnico
    }

}

