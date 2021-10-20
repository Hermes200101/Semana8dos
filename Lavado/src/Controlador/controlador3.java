/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Datos;
import Modelo.preciosM;
import static Modelo.preciosM.getAuto;
import Vista.preciosV;
import Vista.lavado;
import static Vista.lavado.s;
import static Vista.lavado.v;
import Vista.registro;
import static Vista.registro.tabla;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wlfran
 */
public class controlador3 extends preciosM{

    String au;
    double total1 =0, total2 = 0;
    static ArrayList<Datos> lista = new ArrayList<>();
    

    public void array(){
        lista.add(new Datos(lavado.txt_fecha.getText(), lavado.txt_nombre.getText(), lavado.v, lavado.s));
    }
    
    public void mostrar(){
        String matriz[][] = new String[lista.size()][4];

        for (int i = 0; i < lista.size(); i++) {

            matriz[i][0] = lista.get(i).getFecha();
            matriz[i][1] = lista.get(i).getNombre();
            matriz[i][2] = lista.get(i).getVehiculo();
            matriz[i][3] = lista.get(i).getServicio();
        }
        registro.tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Fecha", "Funcionario", "Vehiculo", "Servicio"
            }
        ));
    }
    
    public void dat (){
        try {
            setAuto(Double.parseDouble(preciosV.txtAuto.getText()));
            setCamioneta(Double.parseDouble(preciosV.txtCamioneta.getText()));
            setCombo1(Double.parseDouble(preciosV.txtCombo1.getText()));
            setCombo2(Double.parseDouble(preciosV.txtCombo2.getText()));
            setCombo3(Double.parseDouble(preciosV.txtCombo3.getText()));
            setLbasico(Double.parseDouble(preciosV.txtLbasico.getText()));
            setLespecial(Double.parseDouble(preciosV.txtLespecial.getText()));
            setDbasica(Double.parseDouble(preciosV.txtDbasico.getText()));
            setDavanzada(Double.parseDouble(preciosV.txtDavanzado.getText()));
            JOptionPane.showMessageDialog(null, "Datos ingresados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }
       
    }
    
    
    public void precio(){
        if( "Camioneta".equals(lavado.v)){
            total1 = getCamioneta();
            System.out.println("Camioneta");
        }
        else{
            total1 = getAuto();
            System.out.println("Automovil");
        }
        
        if("Lavado Básico".equals(lavado.s)){
            total1 = total1 + getLbasico();
            System.out.println(getLbasico());
            System.out.println(total1);
        }
        
        if("Lavado especial".equals(lavado.s)){
            total1 = total1 + getLespecial();
            System.out.println(total1);
        }
        
        if("Desinfección básica".equals(lavado.s)){
            total1 = total1 + getDbasica();
            System.out.println(total1);
        }
        
        if("Desinfección avanzada".equals(lavado.s)){
            total1 = total1 + getDavanzada();
            System.out.println(total1);
        }
            
    }

    public void check(){
        if(lavado.chekcombo1.isSelected()){
            total1 = total1 *getCombo1();
        }
        if(lavado.chekcombo2.isSelected()){
            total1 = total1 * getCombo2();
        }
        if(lavado.chekcombo3.isSelected()){
            total1 = total1 * getCombo3();
        }
    }
    
    public void fin(){
        lavado.txt_valor.setText(""+total1);
        JOptionPane.showMessageDialog(null, "Usuario registrado");
    }
    
    TableRowSorter TRSFiltro;

    public void au() {
        System.out.println(getAuto());
    }

    public void Filtro() {
        int ColumntaTabla = 0;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(registro.fecha.getText(), ColumntaTabla));
    }

    public void filtrar() {
        registro.fecha.addKeyListener(new KeyAdapter() {

            public void keyReleased(final KeyEvent e) {
                String cadena = (registro.fecha.getText());
                registro.fecha.setText(cadena);
                Filtro();
            }

        });

        TRSFiltro = new TableRowSorter(registro.tabla.getModel());
        registro.tabla.setRowSorter(TRSFiltro);
    }
    
    public void filtar2(){
        registro.funcionario.addKeyListener(new KeyAdapter() {

            public void keyReleased(final KeyEvent e) {
                String cadena = (registro.funcionario.getText());
                registro.funcionario.setText(cadena);
                Filtro2();
            }

        });

        TRSFiltro = new TableRowSorter(registro.tabla.getModel());
        registro.tabla.setRowSorter(TRSFiltro);
    }
    public void Filtro2(){
        int ColumntaTabla = 1;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(registro.funcionario.getText(), ColumntaTabla));
    }
    
    public void filtar3(){
        registro.servicio.addKeyListener(new KeyAdapter() {

            public void keyReleased(final KeyEvent e) {
                String cadena = (registro.servicio.getText());
                registro.servicio.setText(cadena);
                Filtro3();
            }

        });

        TRSFiltro = new TableRowSorter(registro.tabla.getModel());
        registro.tabla.setRowSorter(TRSFiltro);
    }
    public void Filtro3(){
        int ColumntaTabla = 3;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(registro.servicio.getText(), ColumntaTabla));
    }
    
    
}
