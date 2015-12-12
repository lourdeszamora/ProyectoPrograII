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
public class Rango9 extends Ficha implements Cloneable {
    
    /**
     *
     * @param caracteristica
     */
    public Rango9(String caracteristica) {
        super(9, 1, (caracteristica.equalsIgnoreCase("bueno"))?"Aragorn":"Saruman", caracteristica);
        colocarImagenPersonaje();
    } 
  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rango9 clon = new Rango9(this.caracteristica);
        return clon;
    }
}
