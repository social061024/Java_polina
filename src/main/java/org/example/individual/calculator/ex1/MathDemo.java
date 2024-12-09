package org.example.individual.calculator.ex1;

public class MathDemo {

    public static void main(String[] args){

        double x= 0.32, a= 3.21, b= 2.14, c=1.21;

        double exp =Math.pow(b-c,2);

        double r1 = exp * a;

        double r2 = Math.pow(x,2)+c;

        double r3 = Math.pow(c-x,2);

        double y= (r1)/Math.log(r2)+Math.exp(r3);
        System.out.printf("Результат: %.1f", y);
    }
}

