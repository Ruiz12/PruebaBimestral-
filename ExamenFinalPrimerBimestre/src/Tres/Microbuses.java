/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *
 */
public class Microbuses extends Vehiculos{
    private int numRutas;

    public Microbuses(int numRutas, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.numRutas = numRutas;
    }

    public int getNumRutas() {
        return numRutas;
    }

    public void setNumRutas(int numRutas) {
        this.numRutas = numRutas;
    }
    @Override
    public double PrecioAlquiler(){
        double valor;
        int preciobase;
        preciobase= 50 * getDias();
        valor = preciobase + (10*getClass().getModifiers());
        return valor;
    }
}
