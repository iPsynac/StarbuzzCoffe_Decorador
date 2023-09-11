/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebidas;

/**
 *
 * @author juangamez
 */

public class Espresso extends Bebida {
    public Espresso() {
        descripcion = "Espresso Coffee";
    }

    @Override
    public double costo() {
        return 36.0;
    }
}