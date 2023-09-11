/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condimentos;

import Bebidas.Bebida;
import decorator_starbuzz.CondimentoDecorator;

/**
 *
 * @author juangamez
 */
public class CremaBatida extends CondimentoDecorator {
    Bebida bebida;

    public CremaBatida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema Batida";
    }

    @Override
    public double costo() {
        return bebida.costo() + 6.0; // Precio adicional por crema batida
    }
}
