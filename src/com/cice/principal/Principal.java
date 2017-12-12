package com.cice.principal;

import com.cice.logica.Logica;
import com.cice.persona.Persona;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){


        String nombre, apellidos;
        int edad = 10;
        double peso, altura;
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("*******CALCULADORA IMC*******");
        System.out.println("*****************************");
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Intriduce tus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Introduce tu peso en KG: ");
        peso = sc.nextDouble();
        System.out.print("Introduce tu altura en metros:");
        altura = sc.nextDouble();

        Persona usuario = new Persona(nombre, apellidos, edad, altura, peso);

        System.out.println("**********************************");
        System.out.println("¿Que quieres hacer " + nombre + apellidos +"?");
        System.out.println("1.- Calcular tu IMC");
        System.out.println("2.- Salir");
        opcion = sc.nextInt();

        System.out.println("********************************");

        if (opcion != 0){

            Logica.calcularIMC(usuario);

        } else {
            System.out.println("Adios");
        }
    }
}
