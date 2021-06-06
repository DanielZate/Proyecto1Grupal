package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "subgerente")
public class SubGerente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubGerente;

    @Column(name = "idUsuarioFk", nullable = false)
    private int idUsuarioFk;

    @Column(name= "nombreSubGerente", length = 50)
    private String nombreSubGerente;

    @Column(name= "apellidoSubGerente", length = 50)
    private String apellidoSubGerente;

    @Column(name= "tipoDocSubGerente", length = 50)
    private String tipoDocSubGerente;

    @Column(name= "numDocSubGerente")
    private int numDocSubGerente;

    @Column(name= "correoSubGerente", length = 50)
    private String correoSubGerente;

    @Column(name= "telefonoSubGerente")
    private int telefonoSubGerente;

    @OneToOne
    @JoinColumn(name = "idUsuarioFk", insertable = false, updatable = false)
    private Usuario Usuario2;

    @OneToMany(mappedBy = "subGerente2")
    private List<Cotizacion>cotizaciones;
    
    public SubGerente() {
    }

    public SubGerente(int idSubGerente, int idUsuarioFk, String nombreSubGerente, String apellidoSubGerente,
            String tipoDocSubGerente, Integer numDocSubGerente, String correoSubGerente, int telefonoSubGerente) {
        this.idSubGerente = idSubGerente;
        this.idUsuarioFk = idUsuarioFk;
        this.nombreSubGerente = nombreSubGerente;
        this.apellidoSubGerente = apellidoSubGerente;
        this.tipoDocSubGerente = tipoDocSubGerente;
        this.numDocSubGerente = numDocSubGerente;
        this.correoSubGerente = correoSubGerente;
        this.telefonoSubGerente = telefonoSubGerente;
    }

    public int getIdSubGerente() {
        return idSubGerente;
    }

    public void setIdSubGerente(int idSubGerente) {
        this.idSubGerente = idSubGerente;
    }

    public int getIdUsuario() {
        return idUsuarioFk;
    }

    public void setIdUsuario(int idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public String getNombreSubGerente() {
        return nombreSubGerente;
    }

    public void setNombreSubGerente(String nombreSubGerente) {
        this.nombreSubGerente = nombreSubGerente;
    }

    public String getApellidoSubGerente() {
        return apellidoSubGerente;
    }

    public void setApellidoSubGerente(String apellidoSubGerente) {
        this.apellidoSubGerente = apellidoSubGerente;
    }

    public String getTipoDocSubGerente() {
        return tipoDocSubGerente;
    }

    public void setTipoDocSubGerente(String tipoDocSubGerente) {
        this.tipoDocSubGerente = tipoDocSubGerente;
    }

    public Integer getNumDocSubGerente() {
        return numDocSubGerente;
    }

    public void setNumDocSubGerente(Integer numDocSubGerente) {
        this.numDocSubGerente = numDocSubGerente;
    }

    public String getCorreoSubGerente() {
        return correoSubGerente;
    }

    public void setCorreoSubGerente(String correoSubGerente) {
        this.correoSubGerente = correoSubGerente;
    }

    public int getTelefonoSubGerente() {
        return telefonoSubGerente;
    }

    public void setTelefonoSubGerente(int telefonoSubGerente) {
        this.telefonoSubGerente = telefonoSubGerente;
    }

    
    
    
}
