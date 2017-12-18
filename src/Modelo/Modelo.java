/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo extends JFrame {

    Conexion con;

    public boolean Insertar(int codigo, String nombre, String descripcion, int precio, int cantidad,String tipo, String sabor,String marca, int azucar) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " insert into chocolate (codigo, nombre, descripcion, precio,cantidad, tipo,sabor,marca,azucar) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);
            stmt.setString(2, nombre);
            stmt.setString(3, descripcion);
            stmt.setInt(4, precio);
            stmt.setInt(5, cantidad);
            stmt.setString(6, tipo);
            stmt.setString(7, sabor);
            stmt.setString(8, marca);
            stmt.setInt(9, azucar);

            stmt.executeUpdate();
            System.out.println("Ingreso exitoso");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Ingreso exitoso");
            return true;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            return false;
        }
    }

    public boolean Modificar(int codigo, String nombre, String descripcion, int precio, int cantidad,String tipo, String sabor,String marca, int azucar) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " update chocolate set  nombre=?, descripcion=?, precio=?, cantidad=?,tipo=?,sabor=?,marca=?,azucar=? where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);

          
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setInt(3, precio);
            stmt.setInt(4, cantidad);
            stmt.setString(5, tipo);
            stmt.setString(6, sabor);
            stmt.setString(7, marca);
            stmt.setInt(8, azucar);
            
            stmt.setInt(9, codigo);
            

            stmt.executeUpdate();
            System.out.println("Modificación exitosa");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            return false;
        }
    }

    public boolean Buscar(int codigo, javax.swing.JTextField nombre, javax.swing.JTextField descripcion, javax.swing.JTextField precio,javax.swing.JTextField cantidad,javax.swing.JComboBox tipo, javax.swing.JComboBox sabor,javax.swing.JComboBox marca,  javax.swing.JRadioButton azucarSi,javax.swing.JRadioButton azucarNo) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        boolean resultado = false;

        try {

            String query = " select nombre,descripcion,precio,cantidad,tipo,sabor,marca,azucar from  chocolate where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                nombre.setText(rs.getString("nombre"));
                descripcion.setText(rs.getString("descripcion"));
                precio.setText(rs.getString("precio"));
                cantidad.setText(rs.getString("cantidad"));
                tipo.setSelectedItem(rs.getString("tipo"));
                sabor.setSelectedItem(rs.getString("sabor"));
                marca.setSelectedItem(rs.getString("marca"));
                if(rs.getString("azucar").equals("1")){
                    System.out.println(1);
                    azucarSi.setSelected(true);
                    azucarNo.setSelected(false);
                }else if(rs.getString("azucar").equals("0")){
                    System.out.println(0);
                    azucarSi.setSelected(false);
                    azucarNo.setSelected(true);
                }else{
                     System.out.println("otro");
                        azucarSi.setSelected(false);
                    azucarNo.setSelected(false);
                        }
                
               

                System.out.println("Busqueda exitosa");

                resultado = true;
                // print the results
            }
            

            con.disconnect();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            resultado = false;

        }
        return resultado;
    


}

    public void Eliminar(int codigo) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " delete from chocolate where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
            System.out.println("Registro eliminado");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Registro eliminado");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
        }
    }

    public DefaultTableModel Mostrar() throws ClassNotFoundException, SQLException {
        con = new Conexion();
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Código", "Nombre", "Descripción", "Precio", "Cantidad","Tipo","Sabor","Marca","Azúcar","Valor Total"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = con.connect().prepareStatement("SELECT count(*) as total FROM chocolate");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][10];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = con.connect().prepareStatement("SELECT * FROM chocolate");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("nombre");
                data[i][2] = res.getString("descripcion");
                data[i][3] = res.getString("precio");
                data[i][4] = res.getString("cantidad");
                data[i][5] = res.getString("tipo");
                data[i][6] = res.getString("sabor");
                data[i][7] = res.getString("marca");
                if(res.getString("azucar").equals("1")){
                 data[i][8] = "Sí"  ;
                }else if(res.getString("azucar").equals("0")){
                    data[i][8] = "No"  ;
                }else{
                    data[i][8] = "";
            }
                 data[i][9] = "$"+Integer.toString(Integer.parseInt(res.getString("precio"))*Integer.parseInt(res.getString("cantidad")));
                
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public DefaultTableModel buscarChocolate(int codigo) {
        con = new Conexion();
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Código", "Nombre", "Descripción", "Precio", "Cantidad","Tipo","Sabor","Marca","Azúcar","Valor Total"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = con.connect().prepareStatement("SELECT count(*) as total FROM chocolate where codigo=?");
            pstm.setInt(1, codigo);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][10];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = con.connect().prepareStatement("SELECT * FROM chocolate where codigo=?");
            pstm.setInt(1, codigo);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("nombre");
                data[i][2] = res.getString("descripcion");
                data[i][3] = res.getString("precio");
                data[i][4] = res.getString("cantidad");
                data[i][5] = res.getString("tipo");
                data[i][6] = res.getString("sabor");
                data[i][7] = res.getString("marca");
               if(res.getString("azucar").equals("1")){
                 data[i][8] = "Sí"  ;
                }else if(res.getString("azucar").equals("0")){
                    data[i][8] = "No"  ;
                }else{
                    data[i][8] = "";
            }
               data[i][9] = "$"+Integer.toString(Integer.parseInt(res.getString("precio"))*Integer.parseInt(res.getString("cantidad")));
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;

    }

}
