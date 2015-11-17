/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprograii;
import javax.swing.ImageIcon;
/**
 *
 * @author Lourdes Zamora
 */
public abstract class Ficha {
    
    protected int rango,cant;
    protected String nombre, caracteristica;
    protected ImageIcon imgFicha,imgPersonaje;

    public Ficha(int rango, int cant, String nombre, String caracteristica) {
        this.rango = rango;
        this.cant = cant;
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        colocarImagenFicha(caracteristica);
    }
 /**
 *
 * @author Lourdes Zamora
     * @param caracteristica
 */
    public final void colocarImagenFicha(String caracteristica){
    
        if(caracteristica.equalsIgnoreCase("bueno"))
            this.imgFicha=new ImageIcon("fichabuena.png");
        else
            this.imgFicha=new ImageIcon("fichamala.png");
        
    }
    /**
    *
    * @author Lourdes Zamora
    */
    public void colocarImagenPersonaje(){
        this.imgPersonaje=new ImageIcon("ficha"+this.getNombre()+".png");
    }

    public ImageIcon getImgFicha() {
        return imgFicha;
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
    

}
