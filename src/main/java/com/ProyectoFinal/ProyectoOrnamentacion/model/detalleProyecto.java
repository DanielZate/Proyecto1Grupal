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
@Table(name = "detalleproyecto")
public class detalleProyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdDetalle;

    @Column(name = "IdMedioFk", nullable = false)
    private int IdMedioFk;

    @Column(name = "IdProductoFk", nullable = false)
    private int IdProductoFk;

    @Column(name = "IdMedidasFk", nullable = false)
    private int IdMedidasFk;

    @Column(name= "Cantidad")
    private int Cantidad;

    @Column(name= "Observacion")
    private String Observacion;

    @Column(name= "PrecioDetalle")
    private float PrecioDetalle;



   

    @ManyToOne
    @JoinColumn(name = "IdMedidasFk", insertable =  false, updatable = false)
    private Medidas medidas2;

    @OneToMany(mappedBy =  "detalleProyecto1")
    private List<proyecto>proyectos;

    @ManyToOne
    @JoinColumn(name = "IdMedioFk", insertable =  false, updatable = false)
    private Medio medido2;

    @ManyToOne
    @JoinColumn(name = "IdProductoFk", insertable =  false, updatable = false)
    private Producto producto2;

    @OneToMany(mappedBy =  "detalleProyecto2")
    private List<materialDetalleProyecto>materialDetalleProyectos;



    public detalleProyecto() {
    }

    

    public detalleProyecto(int idDetalle, int idMedioFk, int idProductoFk, int idMedidasFk, int cantidad,
            String observacion, float precioDetalle, Medidas medidas2, List<proyecto> proyectos, Medio medido2) {
        IdDetalle = idDetalle;
        IdMedioFk = idMedioFk;
        IdProductoFk = idProductoFk;
        IdMedidasFk = idMedidasFk;
        Cantidad = cantidad;
        Observacion = observacion;
        PrecioDetalle = precioDetalle;
        this.medidas2 = medidas2;
        this.proyectos = proyectos;
        this.medido2 = medido2;
    }



    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        IdDetalle = idDetalle;
    }

    

    public int getIdMedioFk() {
        return IdMedioFk;
    }



    public void setIdMedioFk(int idMedioFk) {
        IdMedioFk = idMedioFk;
    }



    public int getIdProductoFk() {
        return IdProductoFk;
    }

    public void setIdProductoFk(int idProductoFk) {
        IdProductoFk = idProductoFk;
    }

    public int getIdMedidasFk() {
        return IdMedidasFk;
    }

    public void setIdMedidasFk(int idMedidasFk) {
        IdMedidasFk = idMedidasFk;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String observacion) {
        Observacion = observacion;
    }

    public float getPrecioDetalle() {
        return PrecioDetalle;
    }

    public void setPrecioDetalle(float precioDetalle) {
        PrecioDetalle = precioDetalle;
    }

    
}
