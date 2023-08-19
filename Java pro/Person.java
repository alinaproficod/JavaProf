package ClassPro;

public class Person {
    String name;
     int age;
     double height;
     double weight;
     int money;
     public Person(String name,int age,double height,double weight) {
         this .name = name;
         this.age = age;
         this.height = height;
         this.weight = weight;
     }
      public void displayInfo(){
          System.out.println("Имя: " + name);
          System.out.println("Возраст: " + age + " лет");
          System.out.println("Рост: " + height + " см");
          System.out.println("Вес: " + weight + " кг");


    }
    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю");
        }
    }

    public int getMoney() {
        return money;
    }
}

