/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprograii;
import javax.swing.JLabel;
/**
 *
 * @author Lourdes Zamora
 */
public class prueba {
    public static void main(String[] args) {
        Ficha fic = null;
        Rango9 hol= new Rango9("Malo");
        
        System.out.println(fic.getNombre());
        JLabel hola= new JLabel("lblhola");
        hola.setIcon(fic.getImgFicha());
    }
   
    
    
}
