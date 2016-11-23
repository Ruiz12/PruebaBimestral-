/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuatro;

import java.util.Scanner;

/**
 *
 * @author EDISON RUIZ
 */
public class Ejecutora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean bandera = true;
        while (bandera == true) {

            try {

                System.out.println("Ingrese su nombre");
                String nombre = scan.nextLine();

                System.out.println("Ingrese su apellido");
                String apellido = scan.nextLine();
                String[] calificaciones = {"10", "15", "l"};
                Persona p = new Persona(nombre, apellido, calificaciones);
                System.out.println(p);

                bandera = false;
            } catch (Exception e) {
                System.err.printf("\nExcepcion: %s\n",
                        e);
                scan.nextLine(); // INDICA PARA EL NO ENTRE DE NUEVO 
                System.out.println("Usted Debe ingresar una  cadena. VUYELVA A INGRESAR DE  NUEVO .\n");

            }
        }
    }
}


