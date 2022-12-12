package patikaDev.Basics;

import java.util.Scanner;


public class Examples1 {
    public static void main(String[] args) {
        double tutar,kdvOran1 = 0.18,kdvOran2 = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvTutar = tutar>0&&tutar<1000?tutar*kdvOran1: tutar*kdvOran2;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }
}
