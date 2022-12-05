package patikaDev.Donguler;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac satir olsun? ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int l = 0; l < n - i; l++) {
                System.out.print(" ");
            }
            for (int m = 2 * i - 1; m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}