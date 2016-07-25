package com.ccmorataya;

import java.util.Scanner;

/**
 * Created by ccmorataya on 24/07/16.
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        String numOne, numTwo, numThree;
        numOne = input.nextLine();
        numTwo = input.nextLine();
        numThree = input.nextLine();
        System.out.println(numOne + numTwo + numThree);
    }
}
