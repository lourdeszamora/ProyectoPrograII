/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprograii;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lourdes Zamora
 */
public class LogicaTablero {
    protected Ficha tablero[][]= new Ficha[10][10];
    protected Random rand= new Random();
    protected ArrayList<String> buenos = new ArrayList<>(),malos= new ArrayList<>();
    
    public void rellenarTablero(){
        this.rellenarRangoBandera();
        this.rellenarRangoFortaleza();
        this.rellenarRango2();
        this.rellenarRango9y10();
        this.RellenarPiezasFaltantes();
    }
    
    public void PruebaImpresion(){
        for(int fila=0; fila< tablero.length;fila++){
            for(int col=0;col<tablero[0].length;col++){
            
                if(tablero[fila][col]!=null){
                
                    System.out.print(tablero[fila][col].getNombre()+"-");
                    if(col==9)
                        System.out.println("");
                }
                else{
                
                    System.out.print("     "+"-");
                    if(col==9)
                        System.out.println("");
                }
                   
            }
        
        }
    
    }
    
    public void RellenarFaltantes2(){
        for(int fila=0; fila< tablero.length;fila++){
            for(int col=0;col<tablero[0].length;col++){
            
                if(tablero[fila][col]!=null){
                
                 
                }
                else{
                    
                }
                   
            }
        
        }
    
    }
    
    
    public void rellenarRangoBandera(){    
        rellenarRangoBanderaBuenos();  
        rellenarRangoBanderaMalos();
    }
    
    public void rellenarRangoBanderaMalos(){
        if(malos.contains("Bandera")==false){
        int col=rand.nextInt(8)+1;
        if(tablero[0][col]==null){
            tablero[0][col]=new RangoBandera("malo");
            tablero[0][col-1]= new RangoFortaleza("malo");
            tablero[0][col+1]= new RangoFortaleza("malo");
            tablero[0+1][col]= new RangoFortaleza("malo");
            malos.add(tablero[0][col].getNombre()); 
            malos.add(tablero[0][col-1].getNombre());
            malos.add(tablero[0][col+1].getNombre());
            malos.add(tablero[0+1][col].getNombre());
        } 

        rellenarRangoBandera();  
        }
    }
    
    public void rellenarRangoBanderaBuenos(){
        if(buenos.contains("Bandera")==false){
            int col=rand.nextInt(8)+1;
            if(tablero[9][col]==null){
                tablero[9][col]=new RangoBandera("bueno");
                tablero[9][col-1]= new RangoFortaleza("bueno");
                tablero[9][col+1]= new RangoFortaleza("bueno");
                tablero[9-1][col]= new RangoFortaleza("bueno");
                buenos.add(tablero[9][col].getNombre()); 
                buenos.add(tablero[9][col-1].getNombre());
                buenos.add(tablero[9][col+1].getNombre());
                buenos.add(tablero[9-1][col].getNombre());
            } 
           
            rellenarRangoBanderaBuenos();   
        }
    
    }
    
    public int contarFichas(String nombre,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            int buenosi=0;
            for(String h:buenos){
                if(h.equalsIgnoreCase(nombre)){
                    buenosi++;
                }
            }
            return buenosi;
        }
        else{
            int malosi=0;
            for(String h:malos){
                if(h.equalsIgnoreCase(nombre)){
                    malosi++;
                }
            }
            return malosi;
        }
    }
    
    public void rellenarRangoFortaleza(){
        rellenarRangoFortalezaBuenos();
        rellenarRangoFortalezaMalos();
    }
    
    public void rellenarRangoFortalezaBuenos(){
        if(contarFichas("Fortaleza","bueno")<6){
            boolean random= rand.nextBoolean();
            int fil;
            if(random)
                fil=9;
            else
                fil=8;
            
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new RangoFortaleza("bueno");
                buenos.add(tablero[fil][col].getNombre());
            }
           
            rellenarRangoFortalezaBuenos();
        }
    }
    
    public void rellenarRangoFortalezaMalos(){
          if(contarFichas("Fortaleza","malo")<6){
            boolean random= rand.nextBoolean();
            int fil;
            if(random)
                fil=0;
            else
                fil=1;
            
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new RangoFortaleza("malo");
                malos.add(tablero[fil][col].getNombre());
            }
            rellenarRangoFortalezaMalos();
        }
     }
     
    public void rellenarRango2(){
        rellenarRango2Buenos();
        rellenarRango2Malos();
    }
     
    public void rellenarRango2Buenos(){
        if(contarFichas("CaballerodeRohan","bueno")<8){
            boolean random= rand.nextBoolean();
            int fil;
            if(random)
                fil=6;
            else
                fil=7;
            
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango2("bueno");
                buenos.add(tablero[fil][col].getNombre());
            }
            rellenarRango2Buenos();
        }
    }
    
    public void rellenarRango2Malos(){
        if(contarFichas("Warg-rider","malo")<8){
            boolean random= rand.nextBoolean();
            int fil;
            if(random)
                fil=3;
            else
                fil=2;
            
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango2("malo");
                malos.add(tablero[fil][col].getNombre());
            }
            rellenarRango2Malos();
        }
    }
    
    public void rellenarRango9Buenos(){
        if(buenos.contains("Aragorn")==false){
            boolean random= rand.nextBoolean();
            int fil=6;
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango9("bueno");
                buenos.add(tablero[fil][col].getNombre());
            }
            rellenarRango9Buenos();
        }
    }
    
    public void rellenarRango9Malos(){
        if(!malos.contains("Saruman")){
            boolean random= rand.nextBoolean();
            int fil=3;
            int col= rand.nextInt(10);
             if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango9("malo");
                malos.add(tablero[fil][col].getNombre());
            }
            
            rellenarRango9Malos();
        }  
    }
    
    public void rellenarRango10Buenos(){
        if(!buenos.contains("Gandalf")){
            boolean random= rand.nextBoolean();
            int fil=6;
            int col= rand.nextInt(10);
            if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango10("bueno");
                buenos.add(tablero[fil][col].getNombre());
            }
            rellenarRango10Buenos();
        }
    }
    
    public void rellenarRango10Malos(){
        if(!malos.contains("SeñorNazgul")){
            boolean random= rand.nextBoolean();
            int fil=3;
            int col= rand.nextInt(10);
             if(tablero[fil][col]==null){
                tablero[fil][col]=new Rango10("malo");
                malos.add(tablero[fil][col].getNombre());
            }
            rellenarRango10Malos();
        }  
    }
    
    
    public void rellenarRango9y10(){
        rellenarRango9Buenos();
        rellenarRango9Malos();
        rellenarRango10Buenos();
        rellenarRango10Malos();
    }
    
    public void RellenarPiezasFaltantes(){
       
        //buenos
        for(int fila=6; fila< tablero.length;fila++){
            for(int col=0;col<tablero[0].length;col++){
            
                if(tablero[fila][col]==null){
                    randomFicha(fila,col,"bueno");}
            }
        
        }
        
        //malos
         for(int fila=0; fila< 4;fila++){
            for(int col=0;col<tablero[0].length;col++){
            
                if(tablero[fila][col]==null){
                    randomFicha(fila,col,"malo");}
            }
        
        }

    }
    //true
    public void randomFicha(int fila,int col,String caracteristica){
        boolean resp;
        do{
        int opc=rand.nextInt(7)+1;
        switch(opc){

            case 1:
                resp=rellenarRango1(fila,col,caracteristica);
            break;
            case 2:
                resp=rellenarRango3(fila,col,caracteristica);
            break;
            case 3:
                resp=rellenarRango4(fila,col,caracteristica);
            break;
            case 4:
                resp=rellenarRango5(fila,col,caracteristica);
            break;
            case 5:
                resp=rellenarRango6(fila,col,caracteristica);
            break;
            case 6:
                resp=rellenarRango7(fila,col,caracteristica);
            break;
            default:
                resp=rellenarRango8(fila,col,caracteristica);
            break;
        }}while(resp==false);

            
    }
    
    
    
    public boolean rellenarRango1(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            if(buenos.contains("Eowin")==false){
                    tablero[fila][col]=new Rango1(caracteristica);
                    buenos.add(tablero[fila][col].getNombre());
                    return true;
            }
        }
        else{
            if(malos.contains("GrimaWomtongue")==false){
                    tablero[fila][col]=new Rango1(caracteristica);
                    malos.add(tablero[fila][col].getNombre());
                    return true;
            }   
        }
        return false;
    }
    
    public boolean rellenarRango3(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            if(contarFichas("SoldadodeGondor",caracteristica)<5){
                    tablero[fila][col]=new Rango3(caracteristica);
                    buenos.add("SoldadodeGondor");
                    return true;
            }
        }
        else{
            if(contarFichas("Orco",caracteristica)<5){
                    tablero[fila][col]=new Rango3(caracteristica);
                    malos.add(tablero[fila][col].getNombre());
                    return true;
            }   
        }
        return false;
    }
    
    public boolean rellenarRango4(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            String nombre=nombreRango4Buenos();
            if(nombre!=null){
               tablero[fila][col]=new Rango4(nombre,caracteristica);
               buenos.add(tablero[fila][col].getNombre());
               return true; 
            }
        }
        else{
            if(contarFichas("Haradrim",caracteristica)<4){
                tablero[fila][col]=new Rango4("Haradrim",caracteristica);
                malos.add(tablero[fila][col].getNombre());
                return true;
            }   
        }
        return false;
    }
    public String nombreRango4Buenos(){
        if(buenos.contains("Frodo")==false)
            return "Frodo";
        if(buenos.contains("Merry")==false)
            return "Merry";
        if(buenos.contains("Sam")==false)
            return "Sam";
        if(buenos.contains("Pipin")==false)
            return "Pipin";
        return null;
    }
    public boolean rellenarRango5(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            if(contarFichas("Elfo",caracteristica)<4){
                    tablero[fila][col]=new Rango5(caracteristica);
                    buenos.add(tablero[fila][col].getNombre());
                    return true;
            }
        }
        else{
            if(contarFichas("Berserker",caracteristica)<4){
                    tablero[fila][col]=new Rango5(caracteristica);
                    malos.add(tablero[fila][col].getNombre());
                    return true;
            }   
        }
        return false;
    }
    
    public boolean rellenarRango6(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            String nombre=nombreRango6Buenos();
            if(nombre!=null){
               tablero[fila][col]=new Rango6(nombre,caracteristica);
               buenos.add(nombre);
               return true;
            }
        }
        else{
            if(contarFichas("Uruk-hay",caracteristica)<4){
                tablero[fila][col]=new Rango6("Uruk-hay",caracteristica);
                malos.add(tablero[fila][col].getNombre());
                return true;
            }   
        }
        return false;
    }
    
    public String nombreRango6Buenos(){
        if(buenos.contains("Boromir")==false)
            return "Boromir";
        if(buenos.contains("Arwen")==false)
            return "Arwen";
        if(buenos.contains("Treebeard")==false)
            return "Treebeard";
        if(buenos.contains("Haldir")==false)
            return "Haldir";
        return null;
    }
    
    public boolean rellenarRango7(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            String nombre=nombreRango7Buenos();
            if(nombre!=null){
               tablero[fila][col]=new Rango7(nombre,caracteristica);
               buenos.add(nombre);
               return true;
            }
        }
        else{
           String nombre=nombreRango7Malos();
            if(nombre!=null){
               tablero[fila][col]=new Rango7(nombre,caracteristica);
               malos.add(nombre);
               return true;
            }  
        }
        return false;
    }
    
    public String nombreRango7Buenos(){
        if(buenos.contains("Faramir")==false)
            return "Faramir";
        if(buenos.contains("Theoden")==false)
            return "Theoden";
        if(buenos.contains("Éomer")==false)
            return "Éomer";
        
        return null;
    }
    
    public String nombreRango7Malos(){
        if(malos.contains("Gothmog")==false)
            return "Gothmog";
        if(malos.contains("Lurtz")==false)
            return "Lurtz";
        if(malos.contains("Sharku")==false)
            return "Sharku";
        return null;
    }

    public boolean rellenarRango8(int fila,int col,String caracteristica){
        if(caracteristica.equalsIgnoreCase("bueno")){
            String nombre=nombreRango8Buenos();
            if(nombre!=null){
               tablero[fila][col]=new Rango8(nombre,caracteristica);
               buenos.add(tablero[fila][col].getNombre());
               return true;
            }
        }
        else{
           if(contarFichas("Nazgul",caracteristica)<2){
                tablero[fila][col]=new Rango8("Nazgul",caracteristica);
                malos.add(tablero[fila][col].getNombre());
                return true;
            } 
        }
        return false;
    }
    
    public String nombreRango8Buenos(){
        if(buenos.contains("Legolas")==false)
            return "Legolas";
        else if(buenos.contains("Gimli")==false)
            return "Gimli";
        return null;
    }
   
    
    
}
