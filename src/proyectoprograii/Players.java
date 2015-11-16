/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprograii;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes Zamora
 */
public class Players {
    
    ArrayList<Player> players;

    public Players() {
        players= new ArrayList<>();
    }
       /**
   * Crear Usuario.
   * 
   *
     * @param user
     * @param pass
     * @param name
   * @crearUsuario(user,pass,name);
   */
    public void crearUsuario(String user,char[] pass,String name){
        if(buscarUser(user)==null){
            players.add(new Player(user,pass,name));
            JOptionPane.showMessageDialog(null, "¡El usuario: "+user+" fue agregado con exito!");
        }   
        else
           JOptionPane.showMessageDialog(null, "¡El usuario: "+user+" ya existe.Por favor cambie el UserName!");
    }
    
    public Player buscarUser(String username){
        if(players.isEmpty()==false){
            for(Player p:players){
                if(p.getUserName().equalsIgnoreCase(username))
                    return p;
            }
        }
        return null;
    }
    
    public boolean loginUser(String username, String password){
        Player p =buscarUser(username);
        if (p!=null){
            if(p.getPassword().equals(password)){
                JOptionPane.showMessageDialog(null, "¡Bienvenido: "+username+"!");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "¡El usuario: "+username+" no existe por favor cree el nuevo jugador!");
        return false;
    }
}
