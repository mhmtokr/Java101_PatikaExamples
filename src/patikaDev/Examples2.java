package patikaDev;

import java.util.Scanner;

public class Examples2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("3 kenar uzunluğu giriniz:  ");
        double a, b,c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double cevre = (a+b+c) / 2;

        double alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));

        System.out.println(alan);









    }
}
