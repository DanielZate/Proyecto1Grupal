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
@Table(name = "producto")
public class Producto {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdProducto;

    @Column(name = "IdTipoProductoFk", nullable = false)
    private int IdTipoProductoFk;

    @Column(name = "nombreProducto", length = 30)
    private String nombreProducto;
    
    
    @OneToMany(mappedBy =  "producto2")
    private List<detalleProyecto>detalleProyectos;

    @ManyToOne
    @JoinColumn(name = "IdTipoProductoFk", insertable =  false, updatable = false)
    private tipoProducto tipoproducto2;

    public Producto() {
    }

    public Producto(int idProducto, int idTipoProductoFk, String nombreProducto) {
        IdProducto = idProducto;
        IdTipoProductoFk = idTipoProductoFk;
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public int getIdTipoProductoFk() {
        return IdTipoProductoFk;
    }

    public void setIdTipoProductoFk(int idTipoProductoFk) {
        IdTipoProductoFk = idTipoProductoFk;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    


}
