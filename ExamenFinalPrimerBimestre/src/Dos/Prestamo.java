/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

/**
 *
 */
public class Prestamo {
    private String nombreBeneficiario;
    private double sueldo;
    private double montoPrestamo;
    private  double interes;
    private  int tiempoPrestamoAnios;
    private Garante garante1;

    public Prestamo(String nombreBeneficiario, double sueldo, double montoPrestamo, double interes, int tiempoPrestamoAnios, Garante garante1) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.sueldo = sueldo;
        this.montoPrestamo = montoPrestamo;
        this.interes = interes;
        this.tiempoPrestamoAnios = tiempoPrestamoAnios;
        this.garante1 = garante1;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempoPrestamoAnios() {
        return tiempoPrestamoAnios;
    }

    public void setTiempoPrestamoAnios(int tiempoPrestamoAnios) {
        this.tiempoPrestamoAnios = tiempoPrestamoAnios;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }
    
    public double ValorVehiculoInteres(){
        double valor;
        
        valor = montoPrestamo + ((montoPrestamo*interes)*tiempoPrestamoAnios);
        return valor;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre beficiario: %s\nSueldo Beneficiario: %f\n"
                + "MontoPrestamo: %f\nInteres: %f\nTiempo Prestamo: %i"
                + "\nGarante 1:\nNombre: %s\nApellido: %s\nSueldo: %f",
                getNombreBeneficiario(), getSueldo(),
                getMontoPrestamo(),getInteres(),
                getTiempoPrestamoAnios(),getGarante1().getNombre(),
                getGarante1().getApellido(),
                getGarante1().getSueldo());

    }
 
}
