package patikaDev.Java101.Donguler;

import java.util.Scanner;

public class Pratik6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basValue;
        int num;

        System.out.print("Sayi gir: ");
        num = input.nextInt();
        int basSum = 0;
        while (num != 0) {
            basValue = num %10;
            basSum += basValue;
            num /= 10;
        }

        System.out.println(num + " sayisinin basamaklari toplami: " + basSum);


    }
}
