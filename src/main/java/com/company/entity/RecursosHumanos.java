package com.company.entity;

import jakarta.persistence.*;

@Entity
public class RecursosHumanos {


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Tecnico tecnico;


    // Constructor
    public RecursosHumanos() {
    }
    public RecursosHumanos(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    // Setter y getter
    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    // ToString
    @Override
    public String toString() {
        return "RecursosHumanos{" +
                "tecnico=" + tecnico +
                '}';
    }




    //Métodos (posteriormente se pasaran a service)
    public void realizarAltaTecnico(Tecnico tecnico) {
        // Lógica para dar de alta a un técnico
    }

    public void realizarBajaTecnico(Tecnico tecnico) {
        // Lógica para dar de baja a un técnico
    }

    public void realizarModificacionTecnico(Tecnico tecnico) {
        // Lógica para modificar datos de un técnico
    }

    public void emitirReporte(Tecnico tecnico){
        //Lógica para el reporte diario de un técnico con respecto al incidente
    }
}
