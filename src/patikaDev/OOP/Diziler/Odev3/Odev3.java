package patikaDev.OOP.Diziler.Odev3;

import java.util.Scanner;
public class Odev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısı : ");
        int row = input.nextInt();

        System.out.print("Sütun Sayısı : ");
        int column = input.nextInt();

        int[][] matris = new int[row][column];
        int[][] transpoze = new int[column][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("["+i+"]["+j+"]. Eleman = ");
                matris[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matris : ");
        for(int i[] : matris){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTranspoze : ");
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
