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
public class Rango5 extends Ficha {
    public Rango5(String caracteristica) {
        super(5, 4, (caracteristica.equalsIgnoreCase("bueno"))?"Elfo":"Berserker", caracteristica);
        colocarImagenPersonaje();
    }
}
