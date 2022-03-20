package com.company;

import java.util.Scanner;

public class find_numberPlaceFibonacci {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = number.nextInt();
        //in ra output
        System.out.println("The number with position " + "\'" + n + "\'" + " of the Fibonacci sequence is: " + findFibonacci(n));
    }

    public static int findFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

}


