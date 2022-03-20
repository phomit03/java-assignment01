package com.company;

import java.util.Scanner;

public class find_UclnAndBcnn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter integer b: ");
        int b = scanner.nextInt();

        System.out.println("\"Greatest common divisor of\" " + a + " and " + b + " is: " + UCLN(a,b));
        System.out.println("\"Least common multiple of\" " + a + " and " + b + " is: " + BCNN(a,b));

    }

    public static int UCLN(int a, int b) {
        while ( a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a; // or return b; a = b
    }

    public static int BCNN(int a, int b){
        int result = UCLN(a, b);
        return a * b / result;
    }


}
