package patikaDev.Java102.CollectionMapInterface.Odev2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teams teams = new Teams();

        teams.teamList.add("Galatasaray");
        teams.teamList.add("FenerBahce");
        teams.teamList.add("Besiktas");
        teams.teamList.add("Bursaspor");
        teams.teamList.add("Hatayspor");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("Boluspor");


        teams.ligFixturePrint();

    }
}