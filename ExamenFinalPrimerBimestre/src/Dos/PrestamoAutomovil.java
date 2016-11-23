/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

/**
 *
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoVehiculo;
    private String marcaVehiculo;
    private Garante garante2;

    public PrestamoAutomovil(String tipoVehiculo, String marcaVehiculo, Garante garante2, String nombreBeneficiario,
            double sueldo, double montoPrestamo, double interes, int tiempoPrestamoAnios, Garante garante1) {
        super(nombreBeneficiario, sueldo, montoPrestamo, interes, tiempoPrestamoAnios, garante1);
        this.tipoVehiculo = tipoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.garante2 = garante2;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }
    
    @Override
    public String toString() {
        return String.format("Datos Automovil:\nMarca: %s\nTipo: %s\n"
                + "\nGarante 2:\nNombre: %s\nApellido: %s\nSueldo: %f"
                + "\nValor a Pagar del Vehiculo: %f",
                getMarcaVehiculo(), getTipoVehiculo(),
                getGarante2().getNombre(),
                getGarante2().getApellido(),
                getGarante2().getSueldo(),
                ValorVehiculoInteres());
    }
           
}
