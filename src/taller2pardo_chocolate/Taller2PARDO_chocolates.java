package taller2pardo_chocolate;

import Controlador.Controlador;

import Modelo.Modelo;

import Vista.Agregar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Menu;
import Vista.Modificar;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Taller2PARDO_chocolates {

    public static void main(String[] args) {
    try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}

        Menu menu = new Menu();
        Modelo modelo = new Modelo();
        Agregar agregar = new Agregar();
        Eliminar eliminar = new Eliminar();
        Listar listar = new Listar();
        Modificar modificar = new Modificar();

        Controlador controlador = new Controlador(menu, agregar, eliminar, modificar, listar, modelo);
        controlador.ingresar();
    }

}
