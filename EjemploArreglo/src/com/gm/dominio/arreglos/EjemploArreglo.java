package com.gm.dominio.arreglos;
import com.gm.dominio.arreglos.Persona;

public class EjemploArreglo {

	public static void main(String[] args) {

		int edades[];
		edades = new int[3];
		
		edades[0] = 30;
		edades[1] = 20;
		edades[2] = 10;
		
		System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);
        
        Persona personas[];
        
        personas = new Persona[4];
        personas[0] = new Persona("JUAN");
        personas[1] = new Persona("PEDRO");
        personas[2] = new Persona("KARLA");
	
        System.out.println("");
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        
        String nombres[] = {"Sara","Laura","Carlos","Carmen"};
        
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
	}

}
