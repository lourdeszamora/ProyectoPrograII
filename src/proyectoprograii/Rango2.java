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
public class Rango2 extends Ficha implements Cloneable{
    public Rango2(String caracteristica) {
        super(2, 8, (caracteristica.equalsIgnoreCase("bueno"))?"CaballerodeRohan":"Warg-rider", caracteristica);
        colocarImagenPersonaje();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
      Rango2 clon = new Rango2(this.caracteristica);
      return clon;
    }
}
