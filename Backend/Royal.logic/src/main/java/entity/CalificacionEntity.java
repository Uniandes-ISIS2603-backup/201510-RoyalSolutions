/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
public class CalificacionEntity {
    
    @Id
    @GeneratedValue(generator = "Calificacion")
    
     /**
     * Atributo que modela el nombre del servicio a calificar
     */
    private String nombre;
    
    
    /**
     * Atributo que modela el tipo del servicio a calificar
     */
    private String tipo;
    
    /**
     * Atributo que modela la fecha de la calificacion
     */
    private Date fecha;
    
    
    /**
     * Atributo que modela el valor de la califiicacion
     */
    private double valor;
    
    //Getters and setters
    
    public String getNombre()
    {
        return nombre;
    }
    public String getTipo()
    {
        return tipo;
    }
    public Date getFecha()
    {
        return fecha;
    }
    public double getValor()
    {
        return valor;
    }
    
    public void setNombre(String nNombre){
       nombre = nNombre;
    }
    public void setTipo(String nTipo){
       tipo= nTipo;
    }
    public void setFecha(Date nFecha){
       fecha = nFecha;
    }
    public void setValor(double nValor){
       valor = nValor;
    } 
}