package com.ProyectoFinal.ProyectoOrnamentacion.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "tipoproducto")
public class tipoProducto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTipoProducto;

    @Column(name = "tipoProducto", length = 30)
    private String tipoProducto;

    
    @OneToMany(mappedBy =  "tipoproducto2")
    private List<Producto>productos;


    public tipoProducto() {
    }

    public tipoProducto(int idTipoProducto, String tipoProducto) {
        IdTipoProducto = idTipoProducto;
        this.tipoProducto = tipoProducto;
    }

    public int getIdTipoProducto() {
        return IdTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        IdTipoProducto = idTipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}