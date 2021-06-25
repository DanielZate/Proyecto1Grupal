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
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUsuario;

    @Column(name = "IdRolFk", nullable = false)
    private int IdRolFk;

    @Column(name= "password", length = 50)
    private String password;

    @Column(name= "nombreUsuario", length = 50)
    private String nombreUsuario;

    @Column(name= "apellidoUsuario", length = 50)
    private String apellidoUsuario;

    @Column(name= "tipoDocUsuario", length = 50)
    private String tipoDocUsuario;

    @Column(name= "numDocUsuario")
    private int numDocUsuario;

    @Column(name= "telefonoUsuario")
    private int telefonoUsuario;


    @ManyToOne
    @JoinColumn(name = "IdRolFk", insertable =  false, updatable = false)
    private Rol Rol2;

    @OneToMany(mappedBy =  "usuarios2")
    private List<proyecto>proyectos;


    public Usuario() {
    }

    public Usuario(int idUsuario, int idRolFk, String password, String nombreUsuario, String apellidoUsuario,
            String tipoDocUsuario, int numDocUsuario, int telefonoUsuario) {
        IdUsuario = idUsuario;
        IdRolFk = idRolFk;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tipoDocUsuario = tipoDocUsuario;
        this.numDocUsuario = numDocUsuario;
        this.telefonoUsuario = telefonoUsuario;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getIdRolFk() {
        return IdRolFk;
    }

    public void setIdRolFk(int idRolFk) {
        IdRolFk = idRolFk;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTipoDocUsuario() {
        return tipoDocUsuario;
    }

    public void setTipoDocUsuario(String tipoDocUsuario) {
        this.tipoDocUsuario = tipoDocUsuario;
    }

    public int getNumDocUsuario() {
        return numDocUsuario;
    }

    public void setNumDocUsuario(int numDocUsuario) {
        this.numDocUsuario = numDocUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

}
