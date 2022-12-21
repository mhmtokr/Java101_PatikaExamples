package patikaDev.Java101.OOP.Siniflar.Boks;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int round = 1;
    String first;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run() {
        if (isFirst(false)) {
            System.out.println(f1.name + "is first");
            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("--------------");
                    System.out.println(round+". Round");
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                    round++;
                }

            } else {
                System.out.println("They cannot fight because of weights");
            }


        } else {
            System.out.println(f2.name + "is first");
            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("--------------");
                    System.out.println(round+". Round");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                    round++;
                }

            } else {
                System.out.println("They cannot fight because of weights");
            }

        }



    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("--------------");
            System.out.println("WINNER is the " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("--------------");
            System.out.println("WINNER is the " + f2.name);
            return true;
        }

        return false;
    }


    void printScore() {
        System.out.println(f1.name + " Health \t:" + f1.health);
        System.out.println(f2.name + " Health \t:" + f2.health);
    }

    boolean isFirst (boolean b) {
        double randomV = Math.random() * 100;
        if (randomV <= 50);
        return false;
    }




}
