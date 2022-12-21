package patikaDev.Java101.Donguler;

import java.util.Scanner;

public class Pratik4 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        System.out.print("R Değerini Giriniz: ");
        int r = input.nextInt();

        if(n<r){

            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n = input.nextInt();
        }
        int fakt1=1, fakt2=1, fakt3=1, fark=n-r;
        for(int i=1;i<=n;i++){

            fakt1=fakt1*i;
        }
        System.out.println("N Sayısının Faktöriyeli : " + fakt1);

        for(int j=1;j<=r;j++){

            fakt2=fakt2*j;
        }
        System.out.println("R Sayısının Faktöriyeli : " + fakt2);

        for(int k=1;k<=fark;k++){

            fakt3=fakt3*k;
        }
        System.out.println("(N-R)'nin Faktöriyeli : " + fakt3);

        int carpim=fakt2*fakt3;
        int kombinasyon=fakt1/carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
}