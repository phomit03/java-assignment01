package seasion1;

import java.util.Scanner;

public class find_primeAndFibonacci {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        Scanner number = new Scanner(System.in);

        System.out.println("Please enter 10 elements for the array!");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            myArray[i] = number.nextInt();
            number.nextLine();
        }

        //in ra số nguyên tố
        System.out.println("The prime numbers in the array are: ");
        for (int i = 0; i < 10; i++) {
            if (findPrime(myArray[i]) == true) {
                System.out.println(myArray[i]);
            }
        }

        //in ra số có trong dãy Fibonacci
        System.out.println("The numbers in the Fibonacci sequence are: ");
        for (int i = 0; i < 10; i++) {
            if (findFibo(myArray[i]) == true) {
                System.out.println(myArray[i]);
            }
        }
    }

    public static boolean findPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n < 4) {
            return true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean findFibo(int n) {
        int[] Fn = new int[10];
        int F0 = 0, F1 = 1, F2 = 1;
        for (int i = 0; i < 10; i++) {
            F2 = F0 + F1;
            F0 = F1;
            F1 = F2;
            Fn[i] = F2;
        }
        for (int i = 0; i < 10; i++) {
            if (n == Fn[i]) {
                return true;
            }
        }
        return false;
    }

}
