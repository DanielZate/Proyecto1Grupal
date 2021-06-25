package com.ProyectoFinal.ProyectoOrnamentacion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity 
@Table(name = "proyecto")
public class proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdProyecto;

    @Column(name = "IdDetalleProyectoFk", nullable = false)
    private int IdDetalleProyectoFk;

    @Column(name = "IdUsuarioFk", nullable = false)
    private int IdUsuarioFk;

    @Column(name= "tipoProyecto", length = 30)
    private String tipoProyecto;

    @Column(name= "valorProyecto")
    private float valorProyecto;

    @Column(name= "fechaFinalizacion")
    private Date fechaFinalizacion;

    @Column(name= "fechaInicio")
    private Date fechaInicio;

    @Column(name= "estadoProyecto", length = 30)
    private String estadoProyecto;

    @ManyToOne
    @JoinColumn(name = "IdUsuarioFk", insertable =  false, updatable = false)
    private Usuario usuarios2;

    @ManyToOne
    @JoinColumn(name = "IdDetalleProyectoFk", insertable =  false, updatable = false)
    private detalleProyecto detalleProyecto1;

    public proyecto() {
    }

    public proyecto(int idProyecto, int idDetalleProyectoFk, int idUsuarioFk, String tipoProyecto, float valorProyecto,
            Date fechaFinalizacion, Date fechaInicio, String estadoProyecto) {
        IdProyecto = idProyecto;
        IdDetalleProyectoFk = idDetalleProyectoFk;
        IdUsuarioFk = idUsuarioFk;
        this.tipoProyecto = tipoProyecto;
        this.valorProyecto = valorProyecto;
        this.fechaFinalizacion = fechaFinalizacion;
        this.fechaInicio = fechaInicio;
        this.estadoProyecto = estadoProyecto;
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        IdProyecto = idProyecto;
    }

    public int getIdDetalleProyectoFk() {
        return IdDetalleProyectoFk;
    }

    public void setIdDetalleProyectoFk(int idDetalleProyectoFk) {
        IdDetalleProyectoFk = idDetalleProyectoFk;
    }

    public int getIdUsuarioFk() {
        return IdUsuarioFk;
    }

    public void setIdUsuarioFk(int idUsuarioFk) {
        IdUsuarioFk = idUsuarioFk;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public float getValorProyecto() {
        return valorProyecto;
    }

    public void setValorProyecto(float valorProyecto) {
        this.valorProyecto = valorProyecto;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(String estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }
    
    
}
