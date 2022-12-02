package patikaDev.Donguler;

import java.util.Scanner;

public class Pratik1 {
    public static void main(String[] args) {

        int sayi, toplam=0, ortalama=0, bolme=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();

        for(int i=1; i<sayi; i++){
            if(i%12==0){
                System.out.println(i);
                toplam = toplam+i;
                bolme++;
                ortalama = toplam/bolme;
            }
        }
        System.out.println("Ortalama :" + ortalama);





    }
}
