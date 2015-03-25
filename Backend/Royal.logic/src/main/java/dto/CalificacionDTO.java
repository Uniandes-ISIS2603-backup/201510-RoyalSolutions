/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class CalificacionDTO {
    
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
    
    //-----------------------------
    //Constructor
    //-----------------------------
    
    public CalificacionDTO(String pNombre, String pTipo, Date pFecha, double pValor)
    {
        nombre = pNombre;
        tipo = pTipo;
        fecha = pFecha;
        valor = pValor;
        
    }
    
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
