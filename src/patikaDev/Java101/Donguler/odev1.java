package patikaDev.Java101.Donguler;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac sayi ekleyeceksin? ");
        int n = input.nextInt();
        int max = 0, min = 0 ;

        for(int i = 0 ; i<n; i++){
            System.out.print("Sayi giriniz: ");
            int number = input.nextInt();

            if(i==0){
                max = number;
                min = number;

            }

            if(number > max ){
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("min; " + min + "\nmax: " + max);




    }
}
