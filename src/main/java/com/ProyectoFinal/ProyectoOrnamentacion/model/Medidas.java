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
@Table(name = "medidas")
public class Medidas {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMedida;

    @Column(name = "Medidas", length = 50)
    private String Medidas;


    @OneToMany(mappedBy =  "medidas2")
    private List<detalleProyecto>detalleProyectos;

 

    
    public Medidas() {
    }

    
    public Medidas(int idMedida, String medidas) {
        IdMedida = idMedida;
        Medidas = medidas;
    }



    public int getIdMedida() {
        return IdMedida;
    }

    public void setIdMedida(int idMedida) {
        IdMedida = idMedida;
    }

    public String getMedidas() {
        return Medidas;
    }

    public void setMedidas(String medidas) {
        Medidas = medidas;
    }

    
}
