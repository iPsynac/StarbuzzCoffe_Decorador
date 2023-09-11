/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator_starbuzz;

import Bebidas.Bebida;
import Bebidas.Decaf;
import Bebidas.Espresso;
import Condimentos.Chocolate;
import Condimentos.CremaBatida;

/**
 *
 * @author juangamez
 */
public class Main {


    public static void main(String[] args) {
       // Crear una bebida base, por ejemplo, Espresso
        System.out.println("StarBuzz Coffe");
        System.out.println("---------------------------");
       
       
        Bebida miBebida = new Decaf();
        System.out.println("Bebida: " + miBebida.getDescripcion() + ", Costo: $" + miBebida.costo());


        System.out.println("");
        // Agregar condimento Chocolate dos veces
        miBebida = new Chocolate(miBebida); // Agregar el primer chocolate
        miBebida = new Chocolate(miBebida); // Agregar el segundo chocolate

        // Agregar crema batida
        miBebida = new CremaBatida(miBebida);

        // Imprimir la descripción y el costo de la bebida personalizada
        System.out.println("Bebida: " + miBebida.getDescripcion() + ", Costo: $" + miBebida.costo());
        System.out.println("---------------------------");
    }

}
