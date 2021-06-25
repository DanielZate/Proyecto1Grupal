package com.ProyectoFinal.ProyectoOrnamentacion.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "material")
public class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMaterial;

    @Column(name = "IdTipoMaterialFk", nullable = false)
    private int IdTipoMaterialFk;

    @Column(name = "nombreMaterial", length = 50)
    private String nombreMaterial;

    @OneToMany(mappedBy =  "Material2")
    private List<materialDetalleProyecto>materialDetalleProyectos;

    @ManyToOne
    @JoinColumn(name = "IdTipoMaterialFk", insertable =  false, updatable = false)
    private tipoMaterial tipoMaterial2;

    public Material() {
    }

    public Material(int idMaterial, int idTipoMaterialFk, String nombreMaterial) {
        IdMaterial = idMaterial;
        IdTipoMaterialFk = idTipoMaterialFk;
        this.nombreMaterial = nombreMaterial;
    }

    public int getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        IdMaterial = idMaterial;
    }

    public int getIdTipoMaterialFk() {
        return IdTipoMaterialFk;
    }

    public void setIdTipoMaterialFk(int idTipoMaterialFk) {
        IdTipoMaterialFk = idTipoMaterialFk;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
}
