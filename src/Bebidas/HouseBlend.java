/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebidas;

/**
 *
 * @author juangamez
 */
public class HouseBlend extends Bebida {
    public HouseBlend() {
        descripcion = "House Blend Coffee";
    }

    @Override
    public double costo() {
        return 38.0;
    }
}
