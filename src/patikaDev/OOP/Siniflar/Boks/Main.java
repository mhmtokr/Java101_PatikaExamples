package patikaDev.OOP.Siniflar.Boks;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Holyfield" , 15 , 100, 90, 50);
        Fighter alex = new Fighter("Tyson" , 10 , 95, 100, 20);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }

}
