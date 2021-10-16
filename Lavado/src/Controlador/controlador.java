/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Datos;
import Vista.lavado;
import Vista.preciosV;
import Vista.registro;
import java.util.ArrayList;

/**
 *
 * @author Wlfran
 */
public class controlador {
    static preciosV ventana = new preciosV (); 
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
    
    public static void accionesBotonAceptar(){

        System.out.println("PRESIONO EL BOTON AGREGAR");
        double auto, camint,combo1, combo2,combo3, lavadoBasico,lavadoEspecial,desinfeccionbasica,desinfeccionAvanzada;

       
        auto = Double.parseDouble(ventana.getTxtAuto().getText());
        camint = Double.parseDouble(ventana.getTxtCamioneta().getText());
        combo1 = Double.parseDouble(ventana.getTxtCombo1().getText());
        combo2 = Double.parseDouble(ventana.getTxtCombo2().getText());
        combo3 = Double.parseDouble(ventana.getTxtCombo3().getText());
        lavadoBasico = Double.parseDouble(ventana.getTxtLbasico().getText());
        desinfeccionbasica = Double.parseDouble(ventana.getTxtDbasico().getText());
        desinfeccionAvanzada = Double.parseDouble(ventana.getTxtDavanzado().getText());
        
        preciosV p = new preciosV();
        
//        p.setAuto(auto);
//        p.setCamioneta(camint);
    }
//        
    
    
}
