package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cotizacion")
public class Cotizacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCotizacion;

    @Column(name = "idSubGerenteFk", nullable = false)
    private int idSubGerenteFk;

    @Column(name= "valorCotizacion", length = 10)
    private String valorCotizacion;

    @Column(name= "fechaCotizacion")
    private Date fechaCotizacion;

    @Column(name= "	estadoCotizacion", length = 20)
    private String 	estadoCotizacion;

    @ManyToOne
    @JoinColumn(name = "idSubGerenteFk", insertable = false, updatable = false)
    private SubGerente subGerente2;


    public Cotizacion() {
    }

    public Cotizacion(int idCotizacion, int idSubGerenteFk, String valorCotizacion, Date fechaCotizacion,
            String estadoCotizacion) {
        this.idCotizacion = idCotizacion;
        this.idSubGerenteFk = idSubGerenteFk;
        this.valorCotizacion = valorCotizacion;
        this.fechaCotizacion = fechaCotizacion;
        this.estadoCotizacion = estadoCotizacion;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public int getIdSubGerenteFk() {
        return idSubGerenteFk;
    }

    public void setIdSubGerenteFk(int idSubGerenteFk) {
        this.idSubGerenteFk = idSubGerenteFk;
    }

    public String getValorCotizacion() {
        return valorCotizacion;
    }

    public void setValorCotizacion(String valorCotizacion) {
        this.valorCotizacion = valorCotizacion;
    }

    public Date getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(Date fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public String getEstadoCotizacion() {
        return estadoCotizacion;
    }

    public void setEstadoCotizacion(String estadoCotizacion) {
        this.estadoCotizacion = estadoCotizacion;
    }

    
    
    
}
