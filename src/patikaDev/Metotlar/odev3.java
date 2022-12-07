package patikaDev.Metotlar;

import java.util.Scanner;

public class odev3 {
    static void pattern() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scan.nextInt();
        System.out.println(number);
        int temp = number;
        do {
            temp -= 5;
            System.out.println(temp);
        } while (temp > 0);
        do {
            temp += 5;
            System.out.println(temp);
        } while (temp != number);
    }

    public static void main(String[] args) {
        pattern();
    }
}