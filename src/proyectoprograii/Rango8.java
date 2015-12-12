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
public class Rango8 extends Ficha implements Cloneable {
    /**
    *
    * @param nombre
    * @param caracteristica
    */
    public Rango8(String nombre,String caracteristica) {
        super(8, 2, nombre, caracteristica);
        colocarImagenPersonaje();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rango8 clon = new Rango8(this.nombre,this.caracteristica);
        return clon;
    }
}
