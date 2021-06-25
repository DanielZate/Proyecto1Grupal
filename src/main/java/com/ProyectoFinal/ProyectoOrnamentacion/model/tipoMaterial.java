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
@Table(name = "tipoMaterial")
public class tipoMaterial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTipoMaterial;

    @Column(name = "tipoMaterial", length = 30)
    private String tipoMaterial;

    @OneToMany(mappedBy =  "tipoMaterial2")
    private List<Material>Materiales;

    public tipoMaterial() {
    }

    public tipoMaterial(int idTipoMaterial, String tipoMaterial) {
        IdTipoMaterial = idTipoMaterial;
        this.tipoMaterial = tipoMaterial;
    }

    public int getIdTipoMaterial() {
        return IdTipoMaterial;
    }

    public void setIdTipoMaterial(int idTipoMaterial) {
        IdTipoMaterial = idTipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    
}
