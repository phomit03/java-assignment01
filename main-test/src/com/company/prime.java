package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        //nhập một số từ bàn phím, kiểm tra có phải số nguyên tố hay không?
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: "); //input
        int n = myNumber.nextInt();

        //in ra output
        if (checkPrime(n)) {
            System.out.println(n + " là 1 số nguyên tố");
        } else {
            System.out.println(n + " không phải là 1 số nguyên tố");
        }
    }

    //kiểm tra có phải số nguyên tố hay không
    public static boolean checkPrime(int n) {
        if (n < 2) { //kiểm tra 1 0 -1...
            return false; //trả về false và tiếp tục kiểm tra
        } else if (n < 4) { //n==2 || n==3
            return true; //thoả mãn, dừng thực thi
        }
        //nếu n >= 4
        for (int i = 2; i <= n / 2; i++) {  //kiểm tra ước t3
            if (n % i ==0){
                return false; //nếu có trả về false (khong phai so nguyen to)
            }
        }
        return true; //trả về true (la so nguyen to)
    }

}
