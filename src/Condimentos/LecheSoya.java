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
public class LecheSoya extends CondimentoDecorator {
    Bebida bebida;

    public LecheSoya(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche de Soya";
    }

    @Override
    public double costo() {
        return bebida.costo() + 7.0; // Precio adicional por leche de soya
    }
}