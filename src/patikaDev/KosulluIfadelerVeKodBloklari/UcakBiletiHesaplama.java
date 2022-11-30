package patikaDev.KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        int km, yas,  tip;
        double ucret, indirim, ucret2, indirimsiz;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi(km) giriniz: ");
        km = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini seciniz:\n1-Tek yon\n2-Gidis-Donus ");
        tip = input.nextInt();

        ucret = (km * 0.10);

        if(tip ==1 && yas>=1 && yas <= 100 && km>= 1){
            System.out.println("Tek yon sectiniz!");
            if(yas<12){
                indirim = ucret - ((ucret*50) / 100);
                System.out.println("Indirimli ucret: " + indirim + ucret);
            }else if(yas>=12 && yas <= 24){
                indirim = ucret - ((ucret*10) / 100);
                System.out.println("Indirimli ucret: " + indirim + ucret);
            }else if(yas>=65 && yas<=100){
                indirim = ucret - ((ucret*30) / 100);
                System.out.println("Indirimli ucret: " + indirim + ucret);
            }else {
                System.out.println(ucret);
            }
        }

        else if(tip == 2 && yas >=1 && yas <= 100 && km >= 1){
            ucret2 = (ucret*2);
            indirimsiz = ucret2;
            System.out.println("Gidis-Donus sectiniz!");

            if(yas<12){
                ucret2 = ucret2 - ((ucret2*20) / 100);
                System.out.println("Indirimsiz ucret: " + ucret2 + indirimsiz);
            } else if (yas >=12 && yas<= 24) {
                ucret2 = ucret2 - ((ucret2*30) / 100);
                System.out.println("Indirimsiz ucret: " + ucret2 + indirimsiz);
            } else if (yas >=65 && yas<=100) {
                ucret2 = ucret2 - ((ucret2*50) / 100);
                System.out.println("Indirimsiz ucret: " + ucret2 + indirimsiz);
            }else {
                indirimsiz = ucret2 - ((ucret2*20) / 100);
                System.out.println("Odeyeceginiz tutar: " + indirimsiz);
            }

        }







    }


}


