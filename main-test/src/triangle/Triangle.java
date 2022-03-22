package triangle;

import java.awt.geom.Area;
import java.util.Scanner;

public class Triangle {
    int a, b, c;

    int calculatePerimeter() {
        return a + b + c;
    }

    double calculateArea() {
        double p = (double) calculatePerimeter()/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}
