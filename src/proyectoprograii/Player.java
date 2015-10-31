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
public class Player {
    
    private String userName,password;
    private int points,goodTeam,badTeam;
    
    
    public Player(String user,char[] pass){
        
        this.badTeam=0;
        this.goodTeam=0;
        this.points=0;
        this.userName=user;
        this.password=String.valueOf(pass);
    
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public int getBadTeam() {
        return badTeam;
    }

    public void setPassword(char[] pass) {
        this.password = String.valueOf(pass);
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGoodTeam(int goodTeam) {
        this.goodTeam = goodTeam;
    }

    public void setBadTeam(int badTeam) {
        this.badTeam = badTeam;
    }
    
    
    
    
    
}
