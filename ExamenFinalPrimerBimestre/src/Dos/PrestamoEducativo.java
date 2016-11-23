/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

/**
 *
 */
public class PrestamoEducativo extends Prestamo{
    private int nivelEstudio;
    private String nombreCentroEducativo;
    private Garante garante2;
    private Garante garante3;

    public PrestamoEducativo(int nivelEstudio, String nombreCentroEducativo, Garante garante2, Garante garante3,
            String nombreBeneficiario, double sueldo, double montoPrestamo, double interes, int tiempoPrestamoAnios,
            Garante garante1) {
        super(nombreBeneficiario, sueldo, montoPrestamo, interes, tiempoPrestamoAnios, garante1);
        this.nivelEstudio = nivelEstudio;
        this.nombreCentroEducativo = nombreCentroEducativo;
        this.garante2 = garante2;
        this.garante3 = garante3;
    }

    public int getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(int nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombreCentroEducativo() {
        return nombreCentroEducativo;
    }

    public void setNombreCentroEducativo(String nombreCentroEducativo) {
        this.nombreCentroEducativo = nombreCentroEducativo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante garante3) {
        this.garante3 = garante3;
    }
    
    @Override
    public String toString() {
        return String.format("Nivel de estudio: %i\nNombre del Centro Educativo : %s\n"
                + "\nGarante 2:\nNombre: %s\nApellido: %s\nSueldo: %f"
                + "\nGarante 3:\nNombre: %s\nApellido: %s\nSueldo: %f",
                getNivelEstudio(), getNombreBeneficiario(),
                getGarante2().getNombre(),
                getGarante2().getApellido(),
                getGarante2().getSueldo(),
                getGarante3().getNombre(),
                getGarante3().getApellido(),
                getGarante3().getSueldo());
    }
}
