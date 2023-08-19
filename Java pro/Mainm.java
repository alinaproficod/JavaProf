package ClassPro;

public class Mainm {
    public static void main(String[] args) {
        Person person1 = new Person("Alina", 25, 180.0, 75.0);
        Person person2 = new Person("Darius", 16, 160.0, 50.0);
        person1.displayInfo();
        person1.goToWork();
        System.out.println("Деньги у " + person1.getMoney());
        System.out.println();

        person2.displayInfo();
        person2.goToWork();
        System.out.println("Деньги у " + person2.getMoney());

    }
}
