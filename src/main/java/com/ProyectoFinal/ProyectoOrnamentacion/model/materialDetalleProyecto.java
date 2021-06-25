package com.ProyectoFinal.ProyectoOrnamentacion.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "materialdetalleproyecto")
public class materialDetalleProyecto {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMaterialDetalleProyecto;

    @Column(name = "IdDetalleProyectoFk", nullable = false)
    private int IdDetalleProyectoFk;

    @Column(name = "IdMaterialFk", nullable = false)
    private int IdMaterialFk;

    @Column(name = "nombresMateriales", length = 30)
    private String nombresMateriales;

    @ManyToOne
    @JoinColumn(name = "IdDetalleProyectoFk", insertable =  false, updatable = false)
    private detalleProyecto detalleProyecto2;

    @ManyToOne
    @JoinColumn(name = "IdMaterialFk", insertable =  false, updatable = false)
    private Material Material2;

    public materialDetalleProyecto() {
    }

    public materialDetalleProyecto(int idMaterialDetalleProyecto, int idDetalleProyectoFk, int idMaterialFk,
            String nombresMateriales) {
        IdMaterialDetalleProyecto = idMaterialDetalleProyecto;
        IdDetalleProyectoFk = idDetalleProyectoFk;
        IdMaterialFk = idMaterialFk;
        this.nombresMateriales = nombresMateriales;
    }

    public int getIdMaterialDetalleProyecto() {
        return IdMaterialDetalleProyecto;
    }

    public void setIdMaterialDetalleProyecto(int idMaterialDetalleProyecto) {
        IdMaterialDetalleProyecto = idMaterialDetalleProyecto;
    }

    public int getIdDetalleProyectoFk() {
        return IdDetalleProyectoFk;
    }

    public void setIdDetalleProyectoFk(int idDetalleProyectoFk) {
        IdDetalleProyectoFk = idDetalleProyectoFk;
    }

    public int getIdMaterialFk() {
        return IdMaterialFk;
    }

    public void setIdMaterialFk(int idMaterialFk) {
        IdMaterialFk = idMaterialFk;
    }

    public String getNombresMateriales() {
        return nombresMateriales;
    }

    public void setNombresMateriales(String nombresMateriales) {
        this.nombresMateriales = nombresMateriales;
    }

    

}
