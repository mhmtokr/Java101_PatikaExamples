package patikaDev.Java101.KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölüm: " + (n1 / n2));
                } else {
                    System.out.println("0 Girilemez!");
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız");
        }


    }
}
