/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class puntoB {
    public static void main (String[]args){
    Pizzas p1= new Pizzas();
    p1.setTooping("Tipo");
    p1.setprecio(1000);
    p1.settamaño(10);
    System.out.println(p1.getTooping ()+ p1.gettamaño()+ p1.getprecio());
    
    Scanner lectura = new Scanner (System.in);
    Pizzas [] pizzas = new Pizzas[2];
    for (int i = 0; i< 10;  i++){
        pizzas[i] = new Pizzas ();
        System.out.println("ingredientes/n"+i);
        pizzas [i].setTooping(lectura.next());
        System.out.println("Tamaño/n" + i);
        pizzas [i].settamaño(lectura.nextInt());
        System.out.println("Precio/n"+i);
        pizzas [i].setprecio(lectura.nextDouble());
    }
    
   }
    
}
