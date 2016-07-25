package com.ccmorataya;

import java.util.Scanner;

/**
 * Created by ccmorataya on 24/07/16.
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int numOne, numTwo, numThree;
        numOne = Integer.parseInt(input.nextLine());
        numTwo = Integer.parseInt(input.nextLine());
        numThree = Integer.parseInt(input.nextLine());
        System.out.println(sumaTres(numOne, numTwo, numThree));
    }
    public static int sumaTres(int numOne, int numTwo, int numThree){
        return numOne+numTwo+numThree;
    }
}
