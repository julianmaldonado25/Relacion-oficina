/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionOficinaPersona;


public class Main {
    
   
    public Oficina f;
    private Oficina trabajo;
    
    public static void main(String[] args) {
    Oficina f = new Oficina("Bogota");
    Persona p = new Persona("JM");
    p.trabajo = f;
    
    System.out.println("El es de"+" "+p.getDireccion()+".");
    }
    
}
