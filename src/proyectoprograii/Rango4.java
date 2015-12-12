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
public class Rango4 extends Ficha implements Cloneable{
    public Rango4(String nombre,String caracteristica) {
        super(4, 4, nombre, caracteristica);
        colocarImagenPersonaje();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rango4 clon = new Rango4(this.nombre,this.caracteristica);
        return clon;
    }
}
