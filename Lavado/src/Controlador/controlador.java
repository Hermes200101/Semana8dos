/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.modelo;
import Vista.lavado;
import Vista.precios;
import Vista.principal;
import Vista.registro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Wlfran
 */
public class controlador extends modelo {
    ArrayList<Datos> lista = new ArrayList<>();
    public static principal ventana = new principal();
    
//    public static void mostrar() {
//        ventana.setVisible(true);
//    }
//    public static void ocultar(){
//        ventana.setVisible(false);
//    }
    
    public void lavado(){
        lavado l = new lavado();
        l.setVisible(true);   
    }
    
    public static void precios(){
        precios p = new precios();
        p.setVisible(true);
    

    }
    
    public static void accionesBotonAceptar(){
        precios p = new precios();
        double auto, camint,combo1, combo2,combo3, lavadoBasico,lavadoEspecial,desinfeccionbasica,desinfeccionAvanzada;
        String combo33, autoo;
        
        //p.getTxtAuto().getText();
        auto = Double.parseDouble(p.getTxtAuto().getText());
        camint = Double.parseDouble(p.txtCamioneta.getText());
        combo1 = Double.parseDouble(p.txtCombo1.getText());
        combo2 = Double.parseDouble(p.txtCombo2.getText());
        combo3 = Double.parseDouble(p.txtCombo3.getText());
        lavadoBasico = Double.parseDouble(p.txtLbasico.getText());
        desinfeccionbasica = Double.parseDouble(p.txtDbasico.getText());
        desinfeccionAvanzada = Double.parseDouble(p.txtDavanzado.getText());

        //combo33 = String.valueOf(combo1);
        autoo = String.valueOf(auto);
        //JOptionPane.showInternalMessageDialog(rootPane,"EL VALOR DE COMBO 3 ES = "+combo33);
        //System.out.println("EL VALOR DEL COMBO 3 ES = "+combo33);
        System.out.println("EL VALOR DEL COMBO 3 ES = "+autoo);
        
        //JOptionPane.showMessageDialog(ventana, "EL VALOR DE COMBO 3 ES = "+combo33);
    }
    
    public void registro(){
        registro r = new registro();
        r.setVisible(true);  
    }
    
    
    
    
}
