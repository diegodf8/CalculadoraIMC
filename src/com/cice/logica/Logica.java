package com.cice.logica;

import com.cice.persona.Persona;

public class Logica {

    public static void calcularIMC(Persona persona){

        double imc = persona.getPeso()/(persona.getAltura()*persona.getAltura());

         if(imc < 16){
             System.out.println("Tu imc es de: " + imc +" obteniendo un rango de DESNUTRIDO SEVERO");
         }else if (imc < 18.5){
             System.out.println("Tu imc es de:" + imc +" obteniendo un rango de DESNUTRIDO");
         }else if (imc < 25){
             System.out.println("Tu imc es de:" + imc +" obteniendo un rango de NORMAL");
         }else if (imc <30){
             System.out.println("Tu imc es de:" + imc +" obteniendo un rango de SOBREPESO");
         }else {
             System.out.println("Tu imc es de:" + imc +" obteniendo un rango de OBESIDAD");
         }


    }
}
