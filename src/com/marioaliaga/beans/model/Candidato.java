package com.marioaliaga.beans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;

/**
 * Created by maliaga on 8/17/16.
 */
@ManagedBean
@RequestScoped
public class Candidato {

    public Candidato() {
    }

    private String nombre;
    private String apellido;
    private Integer sueldoDeseado;
    private Date fechaNacimiento;
    private String ciudad;
    private String colonia;
    private String codigoPostal;
    private String comentario   ;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(Integer sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
