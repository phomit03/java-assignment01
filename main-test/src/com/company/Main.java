package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        int x = 10;
        double pi = 3.14150;
        char h = 'h';
        boolean t = true;
        String s = "T2018M";
        s = s + "-" + "SEM2";
        System.out.println(s);

        if(x>=10){
            System.out.println("x>=10");
        }
        else{
            System.out.println("Not found");
        }

        switch (h){
            case 'a':
                System.out.println("A");
                break;
            case 'h':
                System.out.println("H");
                break;
            default:
                System.out.println("Not found");
        }

        for(int i=0; i<10; i++){
            System.out.println("i = " + i);
        }

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap mot so tu ban phim: ");
        n = sc.nextInt(); //scanf("%d", &n); //sc la bien duoc lay tu dong 41
        System.out.println("So vua nhap la: " + n);

        sc.nextLine(); //lenh chan khi nhan enter tu lenh tren de thuc thi lenh duoi (khong co thi se troi lenh)

        System.out.println("Nhap mot chuoi tu ban phim: ");
        String s1;
        s1 = sc.nextLine(); //scanf("%d", &n); //sc la bien duoc lay tu dong 41
        System.out.println("Chuoi vua nhap la: " + s1);


        //array
        int[] arr = new int[10]; //int arr[10]
        arr [0] = 13;
        arr [1] = 15;
        for(int i=0; i<10; i++){
            arr[i] = i*2+1;
        }
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }

        // for-each
        for(int r : arr){
            System.out.println(r);
        }

        String[] products = new String[5];
        for(String product:products){

    }
}
