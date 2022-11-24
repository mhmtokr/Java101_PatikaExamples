package patikaDev;

import java.util.Scanner;


public class Examples6 {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11 , muz = 0.95, patlican = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;

        System.out.print("Armut Kaç Kg? ");
        Scanner input = new Scanner(System.in);
        armutkg = input.nextDouble();

        System.out.print("Elma Kaç Kg? ");
        Scanner input1 = new Scanner(System.in);
        elmakg = input1.nextDouble();

        System.out.print("Domates Kaç Kg? ");
        Scanner input2 = new Scanner(System.in);
        domateskg = input2.nextDouble();

        System.out.print("Muz Kaç Kg? ");
        Scanner input3 = new Scanner(System.in);
        muzkg = input3.nextDouble();

        System.out.print("Patlıcan Kaç Kg? ");
        Scanner input4 = new Scanner(System.in);
        patlicankg = input4.nextDouble();

        double toplam = (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg) + (patlican*patlicankg);

        System.out.println("Toplam Tutar: " + toplam);


    }
}
