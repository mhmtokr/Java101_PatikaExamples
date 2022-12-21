package patikaDev.Java101.Donguler;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ebob = 1, ekok, n1, n2;
        int i =1;
        System.out.println("ilk sayi: ");
        n1 = input.nextInt();
        System.out.println("Ikinci sayi: ");
        n2 = input.nextInt();

        while (i <= n1 && i <= n2){
            if(n1 % i==0 && n2 % i ==0){
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        ekok = n1 * n2 / ebob;
        System.out.println(ekok);

    }
}
