package patikaDev.Java101.Basics;

import java.util.Scanner;

public class Examples5 {
    public static void main(String[] args) {

        double boy, kilo;


        System.out.print("Boy giriniz(m): ");
        Scanner input = new Scanner(System.in);
        boy = input.nextDouble();

        System.out.print("Kilo giriniz(kg): ");
        Scanner input1 = new Scanner(System.in);
        kilo = input1.nextDouble();


        double formul = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: " + formul);


    }
}
