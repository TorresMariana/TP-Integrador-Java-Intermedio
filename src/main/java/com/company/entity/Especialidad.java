package com.company.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;


    // Constructor
    public Especialidad() {
    }

    public Especialidad(String nombre, Tecnico tecnico) {
        this.nombre = nombre;
        this.tecnico = tecnico;
    }


    // Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    // ToString
    @Override
    public String toString() {
        return "Especialidad{" +
                "nombre='" + nombre + '\'' +
                ", tecnico=" + tecnico +
                '}';
    }
}
