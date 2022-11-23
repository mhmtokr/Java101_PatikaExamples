import java.util.Scanner;

public class Examples4 {
    public static void main(String[] args) {

        // Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanını bul.
        // Pi sayısı = 3.14
        // Formül = (pi*(r*r)*a)/360

        double pi = 3.14;

        int r, a;

        System.out.print("Daire dilim alanı hesaplama aracı için yarıçap ve açı ölçüsü giriniz: ");
        Scanner input = new Scanner(System.in);

        r = input.nextInt();
        a = input.nextInt();

        double sonuc = (pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alanı: " +sonuc);





    }
}
