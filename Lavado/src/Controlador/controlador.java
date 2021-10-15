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
import Vista.registro;
import java.util.ArrayList;

/**
 *
 * @author Wlfran
 */
public class controlador extends modelo {
    ArrayList<Datos> lista = new ArrayList<>();
    public void lavado(){
        lavado l = new lavado();
        l.setVisible(true);   
    }
    
    public void precios(){
        precios p = new precios();
        p.setVisible(true);
    }
    
    public void registro(){
        registro r = new registro();
        r.setVisible(true);  
    }
    
    
    
}
