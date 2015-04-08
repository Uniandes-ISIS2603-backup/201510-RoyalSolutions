/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.servicio.logic.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
public class ServicioEntity
{
    @Id
    @GeneratedValue(generator = "Servicio")
    
    private String nombre;
    
    private Date fecha;
   
    private String tipo;
    
    private String ciudad;
    
       public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
    
      public Date getDate() {
        return fecha;
    }

    public void setDate(Date pFecha) {
        this.fecha = pFecha;
    }
    
      public String getType() {
        return tipo;
    }

    public void setType(String pTipo) {
        this.tipo = pTipo;
    }
    
      public String getCity() {
        return ciudad;
    }

    public void setCity(String ciudad) {
        this.ciudad = ciudad;
    }    
}
