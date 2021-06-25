package com.ProyectoFinal.ProyectoOrnamentacion.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "medio")
public class Medio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMedio;

    @Column(name = "url", length = 100)
    private String url;

    @OneToMany(mappedBy =  "medido2")
    private List<detalleProyecto>detalleProyectos;


    public Medio() {
    }

    public Medio(int idMedio, String url) {
        IdMedio = idMedio;
        this.url = url;
    }

    public int getIdMedio() {
        return IdMedio;
    }

    public void setIdMedio(int idMedio) {
        IdMedio = idMedio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}
