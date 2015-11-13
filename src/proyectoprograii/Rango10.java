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
public class Rango10 extends Ficha {

    /**
     *
     * @param caracteristica
     */
    public Rango10(String caracteristica) {
        super(10, 1, (caracteristica.equalsIgnoreCase("bueno"))?"Gandalf":"Nazgul", caracteristica);
        colocarImagenPersonaje();
    }
 
}
