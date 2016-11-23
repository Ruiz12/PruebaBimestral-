/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRES;

/**
 *
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Coches cocheOBJ = new Coches(10, "baa-5478", "balnco", "chevrolet",3);
        Microbuses microbusesOBJ = new Microbuses(25, "alx-2351", "rojo", "Hyundai", 2);
        Camiones camionesOBJ = new Camiones(50, "gsf-894", "azul", "Ford", 4);
        
        Vehiculos[] vehiculos = new Vehiculos[3];
        
        vehiculos[0] = cocheOBJ;
        vehiculos[1] = microbusesOBJ;
        vehiculos[2] = camionesOBJ;
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("El precio de alquiles de "+vehiculos[i].getClass()+" es de: "+vehiculos[i].PrecioAlquiler());
        }
    }
}
