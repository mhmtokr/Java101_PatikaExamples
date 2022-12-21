package patikaDev.Java101.Donguler;

import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Giris yaptiniz!");
                do {
                    System.out.println("1-Para Yatirma\n2-Para Cekme\n3-Bakiye Sorgula\n4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1: {
                            System.out.println("Para miktari: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.println("Para miktari: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye.");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        }
                        default:
                            System.out.println(" ");
                            break;
                    }
                }
                while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            } else {
                System.out.println("Hatali kullanici adi ve sifre. Tekrar deneyiniz.");
                --right;
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur.");
                } else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }

    }


}
