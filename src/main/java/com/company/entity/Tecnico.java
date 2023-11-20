package com.company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tecnicos")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;
    private boolean disponibilidad;

    @OneToMany(mappedBy = "tecnicos", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Especialidad> especialidades = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Incidente incidente;


    // Constructor
    public Tecnico() {
    }

    public Tecnico(String nombre, boolean disponibilidad, Set<Especialidad> especialidades, Incidente incidente) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.especialidades = especialidades;
        this.incidente = incidente;
    }


    // Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Set<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Set<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }


    // ToString
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
