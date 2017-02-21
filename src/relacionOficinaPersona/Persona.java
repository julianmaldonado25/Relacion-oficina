/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOficinaPersona;


public class Persona {

 
    private String nombre;
    public Oficina trabajo;
    public String getDireccion;
    
    
    public String getDireccion(){
        
        return this.trabajo.getDireccion();
    }    
    public Persona(String nombre){
        this.nombre = nombre;
    }
}
