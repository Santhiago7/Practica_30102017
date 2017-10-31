/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import static ec.edu.ister.modelo.ControlFlujo.ifAnidado;
import ec.edu.ister.modelo.OperacionesBasicas;
import static ec.edu.ister.modelo.OperacionesBasicas.sumaDosNumeros;
import javax.swing.JOptionPane;

/**
 *SANTHIAGO COLUMBA
 * @author ODG-ISC
 */
public class Aplicacion {
  static int e=0,i=0;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
    int op=Integer.parseInt(JOptionPane.showInputDialog(null,"PRACTICA_30102017 \n"+"SELECCIONAR: \n"+
            "1  Suma Dos Numeros \n"+
            "2  Suma con Return \n"+
            "3  Suma Con Parametros \n"+
            "4  IF anidado \n"+
            "0  Para salir."));
        do{
            switch(op){
                case 1:     sumaDosNumeros();                             break;
                case 2:     cargarNumeros();
                            OperacionesBasicas.sumaDevuelve(e, i);        break;
                case 3:     cargarNumeros();
                            OperacionesBasicas.sumaDosParametros(e, i);   break;
                case 4:     ifAnidado();                                  break;
                case 0:     System.exit(0);                               break;
                
                default:    JOptionPane.showMessageDialog(null,"ERROR: No existe orden.");
                            menu();
                break;
            }
        }while(op!=0);
    }
    public static void cargarNumeros(){
         e=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer valor: "));
         i=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese segundo valor: "));
    }

}
