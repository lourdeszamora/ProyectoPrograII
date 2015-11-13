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
public class Rango1 extends Ficha{
    public Rango1(String caracteristica) {
        super(1, 1, (caracteristica.equalsIgnoreCase("bueno"))?"Eowin":"Warg-rider", caracteristica);
        colocarImagenPersonaje();
    }
}
