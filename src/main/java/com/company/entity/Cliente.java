package com.company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String razonSocial;
    private int cuit;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Servicio> servicios = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private AreaComercial areaComercial;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Operador operador;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Incidente> incidentes = new HashSet<>();


    // Constructor
    public Cliente() {
    }

    public Cliente(String razonSocial, int cuit, Set<Servicio> servicios, AreaComercial areaComercial, Operador operador, Set<Incidente> incidentes) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.servicios = servicios;
        this.areaComercial = areaComercial;
        this.operador = operador;
        this.incidentes = incidentes;
    }

    // Setter y getter
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Set<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Servicio> servicios) {
        this.servicios = servicios;
    }

    public AreaComercial getAreaComercial() {
        return areaComercial;
    }

    public void setAreaComercial(AreaComercial areaComercial) {
        this.areaComercial = areaComercial;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }


    // ToString
    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", cuit=" + cuit +
                ", servicios=" + servicios +
                ", areaComercial=" + areaComercial +
                ", operador=" + operador +
                '}';
    }
}
