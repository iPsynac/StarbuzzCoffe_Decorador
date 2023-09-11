/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebidas;

/**
 *
 * @author juangamez
 */

public class DarkRoast extends Bebida {
    public DarkRoast() {
        descripcion = "Dark Roast Coffee";
    }

    @Override
    public double costo() {
        return 45.0;
    }
}