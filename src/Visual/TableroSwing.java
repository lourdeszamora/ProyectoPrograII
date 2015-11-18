/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;


import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import proyectoprograii.LogicaTablero;

/**
 *
 * @author Lourdes Zamora
 */
public class TableroSwing extends JFrame {
   static LogicaTablero tab= new LogicaTablero();
    public TableroSwing(){
        
             //En el Constructor se llama al constructor del padre.
        super("Tablero Stratego Lord of the Rings");
        //se le agrega el flowLayout que es la manera de como posicionar 
        GridLayout grid= new GridLayout(0,10);
        getContentPane().setLayout(grid);
        
        JLabel[][] fichas = new JLabel[10][10];
        tab.rellenarTablero();
        for(int fila=0;fila<fichas.length;fila++){
            for(int col=0;col<fichas[fila].length;col++){
                
                fichas[fila][col]=new JLabel();
                if(tab.tablero[fila][col]!=null){
                    if(tab.tablero[fila][col].getCaracteristica().equalsIgnoreCase("bueno"))
                        fichas[fila][col].setIcon(new ImageIcon(getClass().getResource("/images/fichabuena.png")));
                    else
                        fichas[fila][col].setIcon(new ImageIcon(getClass().getResource("/images/fichamala.png")));
                }
                    
                else
                    fichas[fila][col].setIcon(null);
                getContentPane().add(fichas[fila][col]);
                
            }
        }
     
       
    }
    
    public static void main(String[] args) {
        TableroSwing tablero = new TableroSwing();
        tab.PruebaImpresion();
        tablero.setDefaultCloseOperation(3);//el 3 es dispose
        tablero.setSize(670,670);
        tablero.setVisible(true);
    }
    
}
