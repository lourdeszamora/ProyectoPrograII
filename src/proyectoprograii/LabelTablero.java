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
public class LabelTablero extends JLabel implements Cloneable{
    public int fila,col;
    public LabelTablero(int f,int c){
        this.fila=f;
        this.col=c;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        LabelTablero clon = new LabelTablero(this.fila,this.col);
        return clon;
    }
}