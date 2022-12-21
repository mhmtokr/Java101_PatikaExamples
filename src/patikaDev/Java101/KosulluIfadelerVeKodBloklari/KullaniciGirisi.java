package patikaDev.Java101.KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış. Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("1-Evet\n2-Hayır");
            select = input.nextInt();
            if (select == 1) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.next();
                if(newPassword.equals("java123") && newPassword.equals(password)){
                    System.out.println("Şifre son şifreyle aynı olamaz.");
                }else{
                    System.out.println("Şifre değiştirildi !");
                }
            }

        }

    }


}

