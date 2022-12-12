package patikaDev.OOP.Siniflar.OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "101", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Saban", "123", "4", tarih, fizik, bio);
        s1.addBulkExamNote(100, 75, 50);
        s1.isPass();


        Student s2 = new Student("Guduk", "444", "4", tarih, fizik,bio);
        s2.addBulkExamNote(50, 30,70);
        s2.isPass();
    }
}
