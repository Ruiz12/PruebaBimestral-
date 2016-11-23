/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *
 */
public abstract class Vehiculos {
    private String matricula;
    private String color;
    private String marca;
    private int dias;

    public Vehiculos(String matricula, String color, String marca, int dias) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
    public abstract double PrecioAlquiler();
    
    
}
