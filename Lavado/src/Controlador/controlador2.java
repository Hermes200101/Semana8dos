/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.preciosM;
import Vista.preciosV;
import Vista.registro;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class controlador2 extends preciosM{

    TableRowSorter TRSFiltro;
    
   public void au (){
       System.out.println(getAuto());
   }
    
    
    public void Filtro(){
        int ColumntaTabla = 0;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(registro.fecha.getText(), ColumntaTabla));
    }
    
    public void filtrar(){
        registro.fecha.addKeyListener(new KeyAdapter(){
            
            public void keyReleased(final KeyEvent e){
                String cadena = (registro.fecha.getText());
                registro.fecha.setText(cadena);
                Filtro();
            }
            
        });
        
        TRSFiltro = new TableRowSorter(registro.tabla.getModel());
        registro.tabla.setRowSorter(TRSFiltro);
    }
    
    
    /*public void total (){
        double total = 0;
        if (combovehiculo.getSelectedItem().equals("Automovil")) {
            //JOptionPane.showMessageDialog(rootPane, "SELECCIONO COMBO VEHICULO");
            if (comboservicio.getSelectedItem().equals("Lavado Básico")) {
                total = pre.getAuto() + pre.getLbasico();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }
            }
            if (comboservicio.getSelectedItem().equals("Lavado especial")){
                total = pre.getAuto() + pre.getLespecial();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
            }
            if (comboservicio.getSelectedItem().equals("Desinfección básica")){
                total = pre.getAuto() + pre.getDbasica();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }    
            }
            if (comboservicio.getSelectedItem().equals("Desinfección avanzada")){
                total = pre.getAuto() + pre.getDavanzada();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }    
            }
            
            }
        } 
        else {
            //JOptionPane.showMessageDialog(rootPane, "SELECCIONO COMBO CAMIONETA");
            if (comboservicio.getSelectedItem().equals("Lavado Básico")) {
                total = pre.getCamioneta()+ pre.getLbasico();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }
            }
            if (comboservicio.getSelectedItem().equals("Lavado especial")){
                total = pre.getCamioneta() + pre.getLespecial();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
            }
            if (comboservicio.getSelectedItem().equals("Desinfección básica")){
                total = pre.getCamioneta() + pre.getDbasica();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }    
            }
            if (comboservicio.getSelectedItem().equals("Desinfección avanzada")){
                total = pre.getCamioneta() + pre.getDavanzada();
                if (chekcombo1.isSelected() && chekcombo2.isSelected() && chekcombo3.isSelected()) {
                    total = total + pre.getCombo1() + pre.getCombo2() + pre.getCombo3();
                } else {
                    if (chekcombo1.isSelected()) {
                        total = total + pre.getCombo1();
                    }
                    if (chekcombo2.isSelected()) {
                        total = total + pre.getCombo2();
                    }
                    if (chekcombo3.isSelected()) {
                        total = total + pre.getCombo3();
                    }
                }    
            }
            
            }
        }
         
        txt_valor.setText(String.valueOf(total));
        //JOptionPane.showMessageDialog(rootPane, "TOTAL A PAGAR = "+total);
    }*/
    
    
}
