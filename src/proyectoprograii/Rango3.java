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
public class Rango3 extends Ficha implements Cloneable{
    public Rango3(String caracteristica) {
        super(3, 5, (caracteristica.equalsIgnoreCase("bueno"))?"SoldadodeGondor":"Orco", caracteristica);
        colocarImagenPersonaje();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rango3 clon = new Rango3(this.caracteristica);
        return clon;
    }
    
}
