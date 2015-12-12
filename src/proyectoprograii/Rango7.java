/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprograii;

/**
 *
 * @author Lourdes Zamora
 */
public class Rango7 extends Ficha implements Cloneable{
 
    public Rango7(String nombre,String caracteristica) {
        super(7, 3, nombre, caracteristica);
        colocarImagenPersonaje();
    }
   
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rango7 clon = new Rango7(this.nombre,this.caracteristica);
        return clon;
    }
}
