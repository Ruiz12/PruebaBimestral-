/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * EDISON RUIZ
 */
public class Ejecutora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Alumno alumnoOBJ;
        Docente docenteProgramacionOBJ;
        Docente docenteBaseDeDatosOBJ;
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
        
        String nombreEst;
        String apellidoEst;
        String nombreDocente;
        String apellidoDocente;
        String tituloDocente;
        String continuar;
        boolean bandera;
        do {
            System.out.println("\t\tDATOS DEL ALUMNO");
            System.out.println("Ingrese un nombre: ");
            nombreEst = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apellidoEst = scan.nextLine();
            System.out.println("\t\tDATOS DE PROFESORES: ");
            System.out.println("\t\tPROFESOR DE PROGRAMACION");
            System.out.println("Ingrese un nombre: ");
            nombreDocente = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apellidoDocente = scan.nextLine();
            System.out.println("Ingrese Titulo: ");
            tituloDocente = scan.nextLine();
            
            docenteProgramacionOBJ = new Docente(nombreDocente, apellidoDocente, tituloDocente);
            
            System.out.println("\t\tPROFESOR DE BASE DE DATOS");
            System.out.println("Ingrese un nombre: ");
            nombreDocente = scan.nextLine();
            System.out.println("Ingrese un apellido: ");
            apellidoDocente = scan.nextLine();
            System.out.println("Ingrese Titulo: ");
            tituloDocente = scan.nextLine();
            
            docenteBaseDeDatosOBJ = new Docente(nombreDocente, apellidoDocente, tituloDocente);
            
            alumnoOBJ = new Alumno(nombreEst, apellidoEst, docenteProgramacionOBJ, docenteBaseDeDatosOBJ);
            listaAlumnos.add(alumnoOBJ);
            
            System.out.print("Desea ingresar otro alumno (s/n):");
            continuar = scan.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                bandera = false;
            } else {
                bandera = true;
            }
        } while (bandera);
        
        for (Alumno listadoA : listaAlumnos) {
            System.out.println(listadoA);
        }
    }
}
