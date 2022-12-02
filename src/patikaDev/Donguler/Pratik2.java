package patikaDev.Donguler;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int num = 0, total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= num; i++) {
            System.out.print("Enter numbers: ");
            num = scan.nextInt();
            if (num > 0) {
                if (num % 2 == 1) {
                    total += num;
                }
            } else {
                System.out.println("odds numbers you entered sum is: " + total);
            }
        }

        for(int i=0; i<=num; i++){
            System.out.print("Enter numbers: ");
            num = scan.nextInt();
            if (num %2 ==0){
                if(num%4==0){
                    total += num;
                }
            }else {
                System.out.println("sum of divisible 2 and 4 is: " + total);
            }
        }

    }
}
