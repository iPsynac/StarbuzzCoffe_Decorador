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
public class LecheNormal extends CondimentoDecorator {
    Bebida bebida;

    public LecheNormal(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche Normal";
    }

    @Override
    public double costo() {
        return bebida.costo() + 5.0; // Precio adicional por leche normal
    }
}
