package patikaDev.Java101.KosulluIfadelerVeKodBloklari;

import java.util.Scanner;


public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if ((mat > 100) || (mat < 0)) {
            mat = 0;
        }
        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();
        if ((fiz > 100) || (fiz < 0)) {
            fiz = 0;
        }
        System.out.print("Türkçe Notunuz: ");
        tur = input.nextInt();
        if ((tur > 100) || (tur < 0)) {
            tur = 0;
        }
        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();
        if ((kim > 100) || (kim < 0)) {
            kim = 0;
        }
        System.out.print("Müzik Notunuz: ");
        muz = input.nextInt();
        if ((muz > 100) || (muz < 0)) {
            muz = 0;
        }

        double average = (mat + fiz + tur + kim + muz) / 5;
        if (average <= 55) {
            System.out.print("Sınıfta kaldınız.");
        } else {
            System.out.println("Tebrikler. Sınıfı geçtiniz.");
        }

        System.out.print("Ortalamanız: " + average);


    }
}
