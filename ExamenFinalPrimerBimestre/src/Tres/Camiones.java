/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *
 */
public class Camiones extends Vehiculos{
    private int toneladas;

    public Camiones(int toneladas, String matricula, String color, String marca, int dias) {
        super(matricula, color, marca, dias);
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    
    @Override
    public double PrecioAlquiler(){
        double valor;
        int preciobase;
        preciobase= 50 * getDias();
        valor = preciobase + 100;
        return valor;
    }
}
