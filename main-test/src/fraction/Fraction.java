
package fraction;

import java.util.Scanner;

public class Fraction {
    //thuộc tính
    private int numerator, denominator;

    //phương thức getter, setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //phương thức nhập phân số
    public void enterFrac(Scanner sc) {
        int a;
        int b;
        do {
            System.out.println("Please enter numerator: ");
            a = sc.nextInt();
            System.out.println("Please enter denominator: ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("\nPlease re-enter, denominator must not = 0\n");
            }
        } while (b == 0);
        numerator = a;
        denominator = b;
    }

    //phương thức in phân số
    public void display() {
        if (numerator * denominator < 0) {
            System.out.println("-" + Math.abs(numerator) + "/" + Math.abs(denominator));
        } else {
            System.out.println(Math.abs(numerator) + "/" + Math.abs(denominator));
        }
    }

    //tìm UCLN
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a; // or return b
    }

    //phương thức rút gọn phân số
    public void compactFraction() {
        int UCLN = UCLN(Math.abs(numerator), Math.abs(denominator));

        numerator = numerator / UCLN;
        denominator = denominator / UCLN;

        if (this.getDenominator() == 1 || this.getDenominator() == -1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    //phương thức nghịch đảo phân số
    public void inverseFraction() {
        if(numerator == 1){
            System.out.println(denominator);
        } else {
            System.out.println(denominator + "/" + numerator);
        }
    }

    //phương thức tính tổng 2 phân số
    public Fraction add(Fraction fr1, Fraction fr2){
        Fraction indirect = new Fraction();
            indirect.numerator = (fr1.numerator * fr2.denominator) + (fr2.numerator * fr1.denominator);
            indirect.denominator = (fr1.denominator * fr2.denominator);
        return indirect;
    }

    //phương thức tính hiệu 2 phân số
    public Fraction sub(Fraction fr1, Fraction fr2){
        Fraction indirect = new Fraction();
            indirect.numerator = (fr1.numerator * fr2.denominator) - (fr2.numerator * fr1.denominator);
            indirect.denominator = (fr1.denominator * fr2.denominator);
        return indirect;
    }

    //phương thức tính tích 2 phân số
    public Fraction mul(Fraction fr1, Fraction fr2) {
        Fraction indirect = new Fraction();
            indirect.numerator = fr1.numerator * fr2.numerator;
            indirect.denominator = fr1.denominator * fr2.denominator;
        return indirect;
    }

    public Fraction div(Fraction fr1, Fraction fr2) {
        Fraction indirect = new Fraction();
        //nhân nghịch đảo
        indirect.numerator = fr1.numerator * fr2.denominator;
        indirect.denominator = fr1.denominator * fr2.numerator;
        return indirect;
    }
}




