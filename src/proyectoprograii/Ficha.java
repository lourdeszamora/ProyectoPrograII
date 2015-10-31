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
public abstract class Ficha {
    
    protected int rango,cant;
    protected String nombre, caracteristica;

    public Ficha(int rango, int cant, String nombre, String caracteristica) {
        this.rango = rango;
        this.cant = cant;
        this.nombre = nombre;
        this.caracteristica = caracteristica;
    }

    public int getRango() {
        return rango;
    }

    public int getCant() {
        return cant;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristica() {
        return caracteristica;
    }
    
    public abstract boolean confMovimiento();

}
