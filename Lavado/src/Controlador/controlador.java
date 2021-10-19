/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.lavado;
import Vista.preciosV;
import Vista.registro;


/**
 *
 * @author Wlfran
 */
public class controlador {
    static preciosV ventana = new preciosV (); 
    static lavado la = new lavado ();
    
    
    
    
    
    public static void mostrar(){
        
    }
    public void lavado(){
        lavado l = new lavado();
        l.setVisible(true);   
    }
    
    public void precios(){
        preciosV p = new preciosV();
        p.setVisible(true);
    }
    
    public void registro(){
        registro r = new registro();
        r.setVisible(true);  
    }
    
    
}
