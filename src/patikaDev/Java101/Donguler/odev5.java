package patikaDev.Java101.Donguler;
import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {

        int num;
        int b=0;
        int result=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayisi giriniz: ");
        num = input.nextInt();
        System.out.println(num + "Elemanli Fibonacci serisi: ");

        for(int i=0; i<=(num-1); i++){
            System.out.println(b + " ");
            result +=b;
            b=result-b;
        }

    }
}
