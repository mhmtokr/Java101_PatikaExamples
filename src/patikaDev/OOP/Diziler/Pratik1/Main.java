package patikaDev.OOP.Diziler.Pratik1;

public class Main {
    public static void main(String[] args) {

        double [] myList = {1, 2, 3, 4, 5, 6} ;
        double series = 0 ;

        for (int i = 0 ; i < myList.length ; i++) {

            series += (1 / myList[i]) ;
        }

        double average = (myList.length/series);

        System.out.println("The harmonic average is : " + average);
    }
}
