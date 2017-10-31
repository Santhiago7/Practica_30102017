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
public class ControlFlujo {
   public static void ifAnidado(){
        int v=3;
        if (v>3) {
             JOptionPane.showMessageDialog(null,v+"ES MAYOR");
        } else if(v<3){
             JOptionPane.showMessageDialog(null,v+"ES MENOR");
        }else{
            JOptionPane.showMessageDialog(null,"ES IGUAL");
        }
        menu();
    }
}
