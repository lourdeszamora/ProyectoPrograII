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
public class RangoFortaleza extends Ficha implements Cloneable{
    public RangoFortaleza(String caracteristica) {
        super(11, 6, "Fortaleza", caracteristica);
        colocarImagenPersonaje();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        RangoFortaleza clon = new RangoFortaleza(this.caracteristica);
        return clon;
    }
    
}
