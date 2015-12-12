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
public class RangoBandera extends Ficha implements Cloneable{
    public RangoBandera(String caracteristica) {
        super(0, 1, "Bandera", caracteristica);
        colocarImagenPersonaje();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        RangoBandera clon = new RangoBandera(this.caracteristica);
        return clon;
    }
}
