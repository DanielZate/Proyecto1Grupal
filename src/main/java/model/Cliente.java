package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "idUsuarioFk", nullable = false)
    private int idUsuarioFk;

    @Column(name= "nombreCliente", length = 50)
    private String nombreCliente;

    @Column(name= "apellidoCliente", length = 50)
    private String apellidoCliente;

    @Column(name= "tipoDocCliente", length = 50)
    private String tipoDocCliente;

    @Column(name= "numDocCliente")
    private int numDocCliente;

    @Column(name= "telefonoCliente")
    private int telefonoCliente;

    @Column(name= "correoCliente", length = 50)
    private String correoCliente;

    @OneToOne
    @JoinColumn(name = "idUsuarioFk", insertable = false, updatable = false)
    private Usuario Usuario3;


    public Cliente() {
    }

    public Cliente(int idCliente, int idUsuarioFk, String nombreCliente, String apellidoCliente, String tipoDocCliente,
            int numDocCliente, int telefonoCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.idUsuarioFk = idUsuarioFk;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.tipoDocCliente = tipoDocCliente;
        this.numDocCliente = numDocCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(int idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTipoDocCliente() {
        return tipoDocCliente;
    }

    public void setTipoDocCliente(String tipoDocCliente) {
        this.tipoDocCliente = tipoDocCliente;
    }

    public int getNumDocCliente() {
        return numDocCliente;
    }

    public void setNumDocCliente(int numDocCliente) {
        this.numDocCliente = numDocCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    

        

}
