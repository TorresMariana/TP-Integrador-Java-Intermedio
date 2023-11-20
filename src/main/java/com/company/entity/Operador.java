package com.company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "operadores")
public class Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToMany(mappedBy = "operador", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Incidente> incidentes = new HashSet<>();


    // Constructor
    public Operador() {
    }
    public Operador(String nombre, Cliente cliente, Set<Incidente> incidentes) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.incidentes = incidentes;
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

    public Set<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(Set<Incidente> incidentes) {
        this.incidentes = incidentes;
    }


    // ToString
    @Override
    public String toString() {
        return "Operador{" +
                "nombre='" + nombre + '\'' +
                ", cliente=" + cliente +
                ", incidentes=" + incidentes +
                '}';
    }



    // Método (posteriormente se pasaran a service)
    public void solicitarIncidente(Cliente cliente, String servicio, String descripcion, String tipoProblema) {
        //Incidente incidente = new Incidente(cliente, servicio, descripcion, tipoProblema, this);
        //incidentes.add(incidente);
        // Puedes realizar más lógica aquí si es necesario
    }
    //, informa al cliente que el incidente ha sido ingresado

    public void agregueColchon(Incidente incidente){
        if(incidente.getTipoDeProblema() == "complejo"){
            //agregue “un colchón” de horas estimadas para la resolución del problema
        }

    }
}

