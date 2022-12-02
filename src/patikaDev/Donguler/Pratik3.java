package patikaDev.Donguler;

import java.util.Scanner;

public class Pratik3 {
    public static void main(String[] args) {
        int n,f4,f5;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lütfen Bir tamsayı giriniz: ");
            n = inp.nextInt();
            for(int i=1,k=1;i<n || k<n; i*=4,k*=5){
                System.out.println(i + " " +k);
            }
        }
        while(n<0);


    }
}
