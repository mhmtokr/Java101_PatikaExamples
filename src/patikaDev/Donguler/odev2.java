package patikaDev.Donguler;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int perfectNum = input.nextInt();
        int total = 0;

        for(int i=1; i<perfectNum; i++)
            if (perfectNum % i == 0) {
                total += i;
            }
        if (total == perfectNum) {
            System.out.println(perfectNum + " mukemmel sayidir");
        }else {
            System.out.println(perfectNum + " mukemmel sayi degildir");
        }


    }
}
