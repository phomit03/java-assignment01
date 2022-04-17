package seasion1;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = number.nextInt();

        if (checkPerfectNumber(n)) {
            System.out.println(n + " is Perfect Number");
        } else {
            System.out.println(n + " not a Perfect Number");
        }

    }

    public static boolean checkPerfectNumber(int n) {
        int total = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                total += i; //nếu là ước thì cộng vào tổng
            }
        }
        if (total == n & n != 0) {    //So sánh tổng ước số với số đã cho để tìm ra số hoàn hảo
            return true;
        }
        return false;
    }
}