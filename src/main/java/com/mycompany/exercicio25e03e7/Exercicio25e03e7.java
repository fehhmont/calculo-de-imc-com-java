/*
 * Você foi solicitado a criar um programa para acompanhamento de peso, no
qual através do peso e da altura calcula-se o IMC. Após o cálculo, deverá ser
informada a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
IMC Classificação
Menor ou igual a 16 Magreza Severa
Entre 16 e 17 Magreza Moderada
Entre 17 e 18.5 Magreza Leve
Entre 18.5 e 25 Normal
Entre 25 e 30 Obesidade Leve
Entre 30 e 40 Obesidade Severa
Acima de 40 Obesidade Mórbida
 */

package com.mycompany.exercicio25e03e7;

import java.util.Scanner;
import java.math.*;

public class Exercicio25e03e7 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Informe sua altura");
         Double tamanho = valor.nextDouble();
        
        System.out.println("informe seu peso");
         Double peso = valor.nextDouble();
        
        Double imc = peso / (tamanho * tamanho);
        
        if(imc <= 16){
            System.out.println(imc + " Estado; Magreza Severa ");
        
        } else if(imc > 16 && imc <=17){
            
           System.out.println(imc + " Estado; Magreza Moderada ");
        } else if(imc > 17 && imc <=18.5){
            
           System.out.println(imc + " Estado; Magreza Leve ");
        } else if(imc > 18.5 && imc <=25){
            
           System.out.println(imc + " Estado; Normal ");
        } else if(imc > 25 && imc <=30){
            
           System.out.println(imc + " Estado; Obsidade Leve ");
        }else if(imc > 30 && imc <=40){
            
           System.out.println(imc + " Estado; Obsidade Severa ");
        }else{

           System.out.println(imc + " Estado; Obsidade Morbida ");
        }           
        
    }
    
}
