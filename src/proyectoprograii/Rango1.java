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
public class Rango1 extends Ficha implements Cloneable{
    public Rango1(String caracteristica) {
        super(1, 1, (caracteristica.equalsIgnoreCase("bueno"))?"Eowin":"GrimaWomtongue", caracteristica);
        colocarImagenPersonaje();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
      Rango1 clon = new Rango1(this.caracteristica);
      return clon;
    }
}
