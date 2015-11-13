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
public class Rango9 extends Ficha {
    
    /**
     *
     * @param caracteristica
     */
    public Rango9(String caracteristica) {
        super(9, 1, (caracteristica.equalsIgnoreCase("bueno"))?"Aragon":"Saruman", caracteristica);
        colocarImagenPersonaje();
    } 
  
}
