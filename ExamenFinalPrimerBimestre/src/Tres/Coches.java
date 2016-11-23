/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *

 */
public class Coches extends Vehiculos{
    private int NumPasajeros;

    public Coches(int NumPasajeros, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.NumPasajeros = NumPasajeros;
    }

    public int getNumPasajeros() {
        return NumPasajeros;
    }

    public void setNumPasajeros(int NumPasajeros) {
        this.NumPasajeros = NumPasajeros;
    }
    
    @Override
    public double PrecioAlquiler(){
        double valor;
        int preciobase;
        preciobase= 50 * getDias();
        valor = preciobase + (5*getNumPasajeros());
        return valor;
    }
}
