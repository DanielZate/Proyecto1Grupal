package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "idRolFk", nullable = false)
    private int idRolFk;

    @Column(name= "Password", length = 50)
    private String Password;

    @ManyToOne
    @JoinColumn(name = "idRolFk", insertable = false, updatable = false)
    private Rol Rol2;

   @OneToOne(mappedBy = "Usuario2")
   private List<SubGerente>subGerentes;

   @OneToOne(mappedBy = "Usuario3")
   private List<Cliente>cliente2;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idRolFk, String password) {
        this.idUsuario = idUsuario;
        this.idRolFk = idRolFk;
        Password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(int idRolFk) {
        this.idRolFk = idRolFk;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    
    
    

}
