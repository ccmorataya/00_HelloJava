package com.ccmorataya;

import java.util.Scanner;

/**
 * Created by ccmorataya on 24/07/16.
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOne = Integer.parseInt(input.nextLine());
        System.out.println(sumaCienMas(numOne));
    }

    public static int sumaCienMas(int numero){
        int suma = 0;

        for (int i = numero; i<(numero+100); i++){
            suma+= i;
        }
        return suma;
    }

    public static int mayorTres(int numOne, int numTwo, int numThree){
        int[] numeros = {numOne, numTwo, numThree};
        int mayor = 0;

        if (numeros[0] > numeros[1] && numeros[0] > numeros[2]){
            mayor = numeros[0];
        }
        else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]){
            mayor = numeros[1];
        }
        else if (numeros[2] > numeros[0] && numeros[2] > numeros[1]){
            mayor = numeros[2];
        }
        return mayor;
    }

    public static int sumaTres(int numOne, int numTwo, int numThree){
        return numOne+numTwo+numThree;
    }
}
