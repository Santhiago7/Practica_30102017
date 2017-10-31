/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;
import static ec.edu.ister.vista.Aplicacion.menu;
import javax.swing.JOptionPane;

/**
 *SANTHIAGO COLUMBA
 * @author ODG-ISC
 */
public class OperacionesBasicas {
    public static void sumaDosNumeros() {
        int v=6;
        int w=5;
        JOptionPane.showMessageDialog(null,"La suma de "+v+" + "+w+" es :"+(v+w));
        menu();   
    }
    public static void sumaDosParametros(int x,int y) {
        JOptionPane.showMessageDialog(null,"La suma de "+x+" + "+y+" es :"+(x+y));
        menu();   
    }
    public static int sumaDevuelve(int x,int y){
        JOptionPane.showMessageDialog(null,"La suma de "+x+" + "+y+" es :"+(x+y)); 
        menu();
        return x+y;
    }
}
