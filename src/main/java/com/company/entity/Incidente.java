package com.company.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "incidentes")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;
    private String descripcion;
    private String tipoDeProblema;
    private String estado;
    private LocalDate fechaDeingreso;
    private LocalDate fechaDeResolucion;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Tecnico tecnico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_operador")
    private Operador operador;


    // Constructor
    public Incidente() {
    }

    public Incidente(String nombre, String descripcion, String tipoDeProblema, String estado, LocalDate fechaDeingreso, LocalDate fechaDeResolucion, Tecnico tecnico, Cliente cliente, Operador operador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoDeProblema = tipoDeProblema;
        this.estado = estado;
        this.fechaDeingreso = fechaDeingreso;
        this.fechaDeResolucion = fechaDeResolucion;
        this.tecnico = tecnico;
        this.cliente = cliente;
        this.operador = operador;
    }


    // Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeProblema() {
        return tipoDeProblema;
    }

    public void setTipoDeProblema(String tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaDeingreso() {
        return fechaDeingreso;
    }

    public void setFechaDeingreso(LocalDate fechaDeingreso) {
        this.fechaDeingreso = fechaDeingreso;
    }

    public LocalDate getFechaDeResolucion() {
        return fechaDeResolucion;
    }

    public void setFechaDeResolucion(LocalDate fechaDeResolucion) {
        this.fechaDeResolucion = fechaDeResolucion;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "Incidente{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoDeProblema='" + tipoDeProblema + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaDeingreso=" + fechaDeingreso +
                ", fechaDeResolucion=" + fechaDeResolucion +
                ", tecnico=" + tecnico +
                ", cliente=" + cliente +
                ", operador=" + operador +
                '}';
    }


    // Método (posteriormente se pasaran a service)
    public void enviarNotificacionAlTecnico(Tecnico tecnico){
        // Lógica para enviar notificacion al tecnico de un nuevo incidente
    }
}
