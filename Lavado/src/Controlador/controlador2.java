/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.lavado;
import Vista.registro;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class controlador2 {

    registro r;

    TableRowSorter TRSFiltro;
    
    public void Filtro(){
        int ColumntaTabla = 0;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(r.fecha.getText(), ColumntaTabla));
    }
    public void filtrar(){
        r.fecha.addKeyListener(new KeyAdapter(){

            public void keyReleased(final KeyEvent e){
                String cadena = (r.fecha.getText());
                r.fecha.setText(cadena);
                Filtro();
            }
            
        });
        
        TRSFiltro = new TableRowSorter(r.tabla.getModel());
        r.tabla.setRowSorter(TRSFiltro);
    }
    
}
