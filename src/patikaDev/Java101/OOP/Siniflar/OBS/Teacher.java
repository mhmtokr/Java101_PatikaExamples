package patikaDev.Java101.OOP.Siniflar.OBS;

public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }


    void print() {
        System.out.println("Adi: " + this.name);
        System.out.println("MPno: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }
}
