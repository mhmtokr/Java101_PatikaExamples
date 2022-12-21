package patikaDev.Java101.KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;


        Scanner input = new Scanner(System.in);
        System.out.println("Yil Giriniz: ");
        yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " artik bir yildir.");
            } else {
                System.out.println(yil + " artik bir yil degildir.");
            }
        } else if (yil % 4 == 0) {
            System.out.println(yil + " artik bir yildir.");
        } else {
            System.out.println(yil + " artik bir yil degildir.");
        }


    }
}
