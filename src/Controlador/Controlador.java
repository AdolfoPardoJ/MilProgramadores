/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Modelo;

import Vista.Agregar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Menu;
import Vista.Modificar;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Controlador extends JFrame implements ActionListener, MenuListener {

    Menu menu;
    Agregar agregar;
    Eliminar eliminar;
    Modificar modificar;
    Listar listar;
    Modelo m;

    public Controlador(Menu menu, Agregar agregar, Eliminar eliminar, Modificar modificar, Listar listar, Modelo m) {
        this.menu = menu;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        this.listar = listar;
        this.m = m;

        
        
        tresDigitos(agregar.getTxtCodigo(),3);
        tresDigitos(modificar.getTxtcodigo(),3);
        
        
        menu.getjAgregar().addMenuListener(this);
        menu.getjListar().addMenuListener(this);
        menu.getjEliminar().addMenuListener(this);
        menu.getjModificar().addMenuListener(this);

        agregar.getjAgregar().addMenuListener(this);
        agregar.getjListar().addMenuListener(this);
        agregar.getjEliminar().addMenuListener(this);
        agregar.getjModificar().addMenuListener(this);
        agregar.getBtnLimpiar().addActionListener(this);
        
  
        agregar.getBtnAgregar().addActionListener(this);

        eliminar.getjAgregar().addMenuListener(this);
        eliminar.getjListar().addMenuListener(this);
        eliminar.getjEliminar().addMenuListener(this);
        eliminar.getjModificar().addMenuListener(this);
        eliminar.getBtnbuscar().addActionListener(this);
        eliminar.getBtnEliminar2().addActionListener(this);

        modificar.getjAgregar().addMenuListener(this);
        modificar.getjListar().addMenuListener(this);
        modificar.getjEliminar().addMenuListener(this);
        modificar.getjModificar().addMenuListener(this);
        modificar.getBtnBuscar().addActionListener(this);
        modificar.getBtnModificar().addActionListener(this);
        modificar.getBtnLimpiar().addActionListener(this);

        listar.getjAgregar().addMenuListener(this);
        listar.getjListar().addMenuListener(this);
        listar.getjEliminar().addMenuListener(this);
        listar.getjModificar().addMenuListener(this);
        
        listar.getPopEliminar().addActionListener(this);
    }

    public void ingresar() {
        menu.setTitle("Menú | Chocolatería Pardo");
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.setResizable(false);

        agregar.setTitle("Agregar Chocolates | Chocolatería Pardo");
        agregar.setLocationRelativeTo(null);
        agregar.setVisible(false);
        agregar.setResizable(false);

        eliminar.setTitle("Eliminar Chocolates | Chocolatería Pardo");
        eliminar.setLocationRelativeTo(null);
        eliminar.setVisible(false);
        eliminar.setResizable(false);

        modificar.setTitle("Modificar Chocolates | Chocolatería Pardo");
        modificar.setLocationRelativeTo(null);
        modificar.setVisible(false);
        modificar.setResizable(false);
        
        
      
        

        listar.setTitle("Listar Chocolates | Chocolatería Pardo");
        listar.setLocationRelativeTo(null);
        listar.setVisible(false);
        listar.setResizable(false);
        actualizarMostrar();

    }

    public void buscarChocolate() {

       eliminar.getTblBuscar().setModel(m.buscarChocolate(Integer.parseInt(eliminar.getTxtCodigo().getText())));

    }

    public void eliminarChocolate() throws ClassNotFoundException, SQLException {
        
        m.Eliminar(Integer.parseInt(eliminar.getTxtCodigo().getText()));
        buscarChocolate();
    }

    public void buscar() throws ClassNotFoundException, SQLException {
        boolean buscar=m.Buscar(Integer.parseInt(modificar.getTxtcodigo().getText()), modificar.getTxtNombre(), modificar.getTxtDescripcion(), modificar.getTxtPrecio(), modificar.getTxtCantidad(),modificar.getTxtTipo(),modificar.getTxtSabor(),modificar.getTxtMarca(),modificar.getjSi(),modificar.getjNo());
        
            
    }

    public void actualizarMostrar() {
        try {
            listar.getTblMostrar().setModel(m.Mostrar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int tieneazucar(){
        int a=0;
        if(modificar.getjSi().isSelected()){
            a=1;       
        }else if(modificar.getjNo().isSelected()){
        a=0;
         }else ;
        return a;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(agregar.getBtnLimpiar()==e.getSource()){
            limpiarAgregar();
        }
        
        if(modificar.getBtnLimpiar()==e.getSource()){
            limpiarModificar();
        }
        
        
        if(listar.getPopEliminar()==e.getSource()){
            try {
                m.Eliminar(Integer.parseInt(listar.getTblMostrar().getModel().getValueAt(listar.getTblMostrar().getSelectedRow(), 0).toString()));
                actualizarMostrar();
            } catch (ClassNotFoundException ex) {
                
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                
            } catch (SQLException ex) {
                
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                
                
            }
            
        }
        
        
        
       if(modificar.getBtnModificar()==e.getSource()){
            if(validacionesModificar()){
                try {
                    m.Modificar(Integer.parseInt(modificar.getTxtcodigo().getText()),modificar.getTxtNombre().getText(), modificar.getTxtDescripcion().getText(),Integer.parseInt(modificar.getTxtPrecio().getText()),Integer.parseInt(modificar.getTxtCantidad().getText()),modificar.getTxtTipo().getSelectedItem().toString(),modificar.getTxtSabor().getSelectedItem().toString(),modificar.getTxtMarca().getSelectedItem().toString(),tieneazucar());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
      }
        }
        
        if (modificar.getBtnBuscar() == e.getSource()) {
            if(true){
            try {
                
                buscar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        }
       if (eliminar.getBtnEliminar2() == e.getSource()) {
           
            try {
                eliminarChocolate();
                limpiarModificar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    
        if (eliminar.getBtnbuscar() == e.getSource()) {
            
            buscarChocolate();
            
        }

        if (agregar.getBtnAgregar() == e.getSource()) {
            if(validaciones()==true){
            try {
                m.Insertar(Integer.parseInt(agregar.getTxtCodigo().getText()),agregar.getTxtNombre().getText(), agregar.getTxtDescripcion().getText(),Integer.parseInt(agregar.getTxtPrecio().getText()),Integer.parseInt(agregar.getTxtCantidad().getText()),agregar.getTxtTipo().getSelectedItem().toString(),agregar.getTxtSabor().getSelectedItem().toString(),agregar.getTxtMarca().getSelectedItem().toString(),tieneAzucarAgregar());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }

    }

    //public String tieneCola() {
        
      //  if (agregar.getjSi().isSelected()==true&& agregar.getjInstrumento().getSelectedItem().toString().equals("Piano")) {
      //      System.out.println("Sí");
      //      return "Sí";
            
      //  } else if (agregar.getjInstrumento().getSelectedItem().toString().equals("Piano")&&agregar.getjNo().isSelected()==true) {
      //      System.out.println("No");
      //      return "No";
            
      //  } else {
      //      System.out.println("nada");
      //      return "";
      //  }
  //  }
    
     public String tieneAzucarModificar() {
        if (modificar.getjSi().isSelected() == true) {
            return "Sí";
        } else if(modificar.getjNo().isSelected() == true){
            return "No";
        }else{
            return "";
        }
    }
     
      public int tieneAzucarAgregar() {
        if (agregar.getjSi().isSelected() == true&&agregar.getTxtTipo().getSelectedIndex()==0 ) {
            return 1;
        } else if(modificar.getTxtTipo().getSelectedIndex()==0&&modificar.getjNo().isSelected() == true){
            return 0;
        }else{
            return 0;
        }
    }
     

    @Override
    public void menuSelected(MenuEvent e) {
        if (menu.getjAgregar() == e.getSource() || agregar.getjAgregar() == e.getSource() || listar.getjAgregar() == e.getSource() || eliminar.getjAgregar() == e.getSource() || modificar.getjAgregar() == e.getSource()) {
            agregar.setVisible(true);
            menu.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);
            modificar.setVisible(false);
        }

        if (menu.getjEliminar() == e.getSource() || agregar.getjEliminar() == e.getSource() || listar.getjEliminar() == e.getSource() || eliminar.getjEliminar() == e.getSource() || modificar.getjEliminar() == e.getSource()) {
            eliminar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);

            modificar.setVisible(false);
        }

        if (menu.getjListar() == e.getSource() || agregar.getjListar() == e.getSource() || listar.getjListar() == e.getSource() || eliminar.getjListar() == e.getSource() || modificar.getjListar() == e.getSource()) {
            actualizarMostrar();
            listar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);

            eliminar.setVisible(false);
            modificar.setVisible(false);

        }

        if (menu.getjModificar() == e.getSource() || agregar.getjModificar() == e.getSource() || listar.getjModificar() == e.getSource() || eliminar.getjModificar() == e.getSource() || modificar.getjModificar() == e.getSource()) {
            modificar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);

        }
    }
//c
    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }

    public boolean validaciones() {
        boolean validador = true;
        
        if (Integer.parseInt(agregar.getTxtCodigo().getText())<=99) {
            JOptionPane.showMessageDialog(this, "El código debe tener 3 digitos");
            validador = false;
        }
        
        
        if (agregar.getTxtNombre().getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nombre no debe venir vacío");
            validador = false;
        }
        if (agregar.getTxtDescripcion().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Descripción no puede estar en blanco");
            validador = false;
        }
        if (Integer.parseInt(agregar.getTxtPrecio().getText())<=0||agregar.getTxtPrecio().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El precio de venta debe ser mayor a 0");
            validador = false;
        }
        if (Integer.parseInt(agregar.getTxtCantidad().getText())< 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0");
            validador = false;
        }
        if (agregar.getTxtTipo().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un tipo de chocolate");
            validador = false;
        }
        if (agregar.getTxtSabor().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un sabor de chocolate");
            validador = false;
        }
        if (agregar.getTxtMarca().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una marca de chocolate");
            validador = false;
        }
        if (!agregar.getjSi().isSelected()&&!agregar.getjNo().isSelected()) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar si tiene o no azúcar");
            validador = false;
        }
        
   
      
        return validador;

    }
    
     public boolean validacionesModificar() {
        boolean validador = true;
        if (agregar.getTxtCodigo().getText().length()>3) {
            JOptionPane.showMessageDialog(this, "El código debe tener 3 digitos");
            validador = false;
        }
        
        if (modificar.getTxtNombre().getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nombre no debe venir vacío");
            validador = false;
        }
        
        if (modificar.getTxtDescripcion().getText().equals("")) {
          //  JOptionPane.showMessageDialog(this, "Descripción no puede estar en blanco");
            modificar.getTxtDescripcion().setBackground(Color.red);
            validador = false;
        }
        if (Integer.parseInt(modificar.getTxtPrecio().getText())<=0||modificar.getTxtPrecio().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El precio de venta debe ser mayor a 0");
            validador = false;
        }
        if (Integer.parseInt(modificar.getTxtCantidad().getText())< 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0");
            validador = false;
        }
        if (modificar.getTxtTipo().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un tipo de chocolate");
            validador = false;
        }
        if (modificar.getTxtSabor().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un sabor de chocolate");
            validador = false;
        }
        if (modificar.getTxtMarca().getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una marca de chocolate");
            validador = false;
        }
        if (!modificar.getjSi().isSelected()&&!modificar.getjNo().isSelected()) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar si tiene o no azúcar");
            validador = false;
        }
        
   
      
        return validador;

    }
    
    public void limpiarModificar(){
        System.out.println("Se limpia todo excepto el código");
        modificar.getTxtNombre().setText("");
        modificar.getTxtDescripcion().setText("");
        modificar.getTxtPrecio().setText("0");
        modificar.getTxtCantidad().setText("0");
        modificar.getTxtTipo().setSelectedItem(" ");
        modificar.getTxtSabor().setSelectedItem(" ");
        modificar.getTxtMarca().setSelectedItem(" ");
        modificar.getjSi().setSelected(false);
        modificar.getjNo().setSelected(false);
        
    }
    
     public void limpiarAgregar(){
         agregar.getTxtCodigo().setText("");
        agregar.getTxtNombre().setText("");
        agregar.getTxtDescripcion().setText("");
        agregar.getTxtPrecio().setText("0");
        agregar.getTxtCantidad().setText("0");
        agregar.getTxtTipo().setSelectedItem(" ");
        agregar.getTxtSabor().setSelectedItem(" ");
        agregar.getTxtMarca().setSelectedItem(" ");
        agregar.getjSi().setSelected(false);
        agregar.getjNo().setSelected(false);
        
    }

  
       
       public void tresDigitos(JTextField textField, int cantidad){
            
    textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (textField.getText().length() >= cantidad )
                e.consume();
        }
    });
       }
    
    
       
      

   
   
     
    
    
    
}
