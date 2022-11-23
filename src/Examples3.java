import java.util.Scanner;

public class Examples3 {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, starterPrice = 10;

        System.out.print("km giriniz: ");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        total = km + perKm;
        total += starterPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("toplam tutar: " +total);
    }
}
