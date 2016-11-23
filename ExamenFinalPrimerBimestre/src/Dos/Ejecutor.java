/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Ejecutor {
   
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PrestamoAutomovil preAutomovilOBJ;
        PrestamoEducativo preEducativoOBJ;
        
        Garante garante1;
        Garante garante2;
        Garante garante3;
        
        ArrayList<PrestamoAutomovil> listaPreAutos = new ArrayList<>();
        ArrayList<PrestamoEducativo> listaPreEducs = new ArrayList<>();
        
        String tipoV;
        String marcaV;
        String nombreGarante;
        String nombreEduc;
        String apelldoGarante;
        double sueldoGarante;
        String nombreBenef;
        double sueldoBenef;
        double montoPrestamo;
        double interes;
        int tiempoAnios;
        int nivelEsudio;
        
        
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("\t\tDATOS DEL Beneficiario");
            System.out.println("Ingrese un nombre: ");
            nombreBenef = scan.nextLine();
            System.out.println("Ingrese un sueldo ");
            sueldoBenef = scan.nextDouble();
            System.out.println("Ingrese un monto de prestamo ");
            montoPrestamo = scan.nextDouble();
            System.out.println("Ingrese un interes ");
            interes = scan.nextDouble();
            System.out.println("Ingrese un numero de años");
            tiempoAnios = scan.nextInt();
            
            System.out.println("Ingrese marca del vehiculo: ");
            marcaV = scan.nextLine();
            System.out.println("Ingrese tipo del vehiculo: ");
            tipoV = scan.nextLine();
            
            
            System.out.println("\t\tDatos de Garantes: ");
            System.out.println("\tGarante 1");
            System.out.println("Ingrese un nombre: ");
            nombreGarante = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apelldoGarante = scan.nextLine();
            System.out.println("Ingrese sueldo: ");
            sueldoGarante = scan.nextDouble();
            
            garante1 = new Garante(nombreGarante, apelldoGarante, sueldoGarante);
            
            System.out.println("\tGarante 2");
            System.out.println("Ingrese un nombre: ");
            nombreGarante = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apelldoGarante = scan.nextLine();
            System.out.println("Ingrese sueldo: ");
            sueldoGarante = scan.nextDouble();
            
            garante2 = new Garante(nombreGarante, apelldoGarante, sueldoGarante);
            
            preAutomovilOBJ = new PrestamoAutomovil(tipoV, marcaV, garante2, nombreBenef, sueldoBenef, montoPrestamo,
                                                    interes, tiempoAnios, garante1);
            
            listaPreAutos.add(preAutomovilOBJ);
        }
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("\t\tDATOS DEL Beneficiario");
            System.out.println("Ingrese un nombre: ");
            nombreBenef = scan.nextLine();
            System.out.println("Ingrese un sueldo ");
            sueldoBenef = scan.nextDouble();
            System.out.println("Ingrese un monto de prestamo ");
            montoPrestamo = scan.nextDouble();
            System.out.println("Ingrese un interes ");
            interes = scan.nextDouble();
            System.out.println("Ingrese un numero de años");
            tiempoAnios = scan.nextInt();
            
            System.out.println("Nivel de estudio: ");
            nivelEsudio = scan.nextInt();
            System.out.println("Ingrese nombre del establecimiento educativo ");
            nombreEduc = scan.nextLine();
            
            
            System.out.println("\t\tDatos de Garantes: ");
            System.out.println("\tGarante 1");
            System.out.println("Ingrese un nombre: ");
            nombreGarante = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apelldoGarante = scan.nextLine();
            System.out.println("Ingrese sueldo: ");
            sueldoGarante = scan.nextDouble();
            
            garante1 = new Garante(nombreGarante, apelldoGarante, sueldoGarante);
            
            System.out.println("\tGarante 2");
            System.out.println("Ingrese un nombre: ");
            nombreGarante = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apelldoGarante = scan.nextLine();
            System.out.println("Ingrese sueldo: ");
            sueldoGarante = scan.nextDouble();
            
            garante2 = new Garante(nombreGarante, apelldoGarante, sueldoGarante);
            
            System.out.println("\tGarante 3");
            System.out.println("Ingrese un nombre: ");
            nombreGarante = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apelldoGarante = scan.nextLine();
            System.out.println("Ingrese sueldo: ");
            sueldoGarante = scan.nextDouble();
            
            garante3 = new Garante(nombreGarante, apelldoGarante, sueldoGarante);
            
            preEducativoOBJ = new PrestamoEducativo(nivelEsudio, nombreEduc, garante2, 
                    garante3, nombreBenef, sueldoBenef, montoPrestamo, interes, tiempoAnios, garante1);
            
            listaPreEducs.add(preEducativoOBJ);
        }
        
        
        for (PrestamoAutomovil presAutos : listaPreAutos) {
            System.out.println(presAutos);
        }
        
        for (PrestamoEducativo presEdus : listaPreEducs) {
            System.out.println(presEdus);   
        }
        
        
        
    }
}
