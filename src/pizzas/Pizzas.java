/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Estudiante
 */
public class Pizzas {
        private String Tooping;
        private int tamaño;
        private double precio;
        
   public String getTooping (){
       return Tooping;
   }
   
   public void setTooping (String Toopings){
       this.Tooping = Toopings;
   }
    
   public int gettamaño (){
       return tamaño;
   }
   
   public void settamaño (int tamaño){
       this.tamaño =  tamaño;
   }
   
   public double getprecio (){
       return precio;
   }
   public void setprecio (double precio){
       this.precio =precio;
   }

   
   
   
   
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
