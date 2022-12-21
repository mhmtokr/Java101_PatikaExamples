package patikaDev.Java101.OOP.Siniflar.CarExample;

public class Car {
    //Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 100;
        this.color = color;

    }

    Car(){
        System.out.println("Bos method");
    }

    void increaseSpeed(int increment){
        this.speed += increment;
    }

    void decreaseSpeed(int decrease){
        if(this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Hiziniz : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }

}
