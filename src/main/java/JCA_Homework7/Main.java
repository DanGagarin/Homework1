package JCA_Homework7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Han",10),
                new Cat("Luke",15),
                new Cat("Dart",20),
        };

        Bowl bowl = new Bowl();
        bowl.putFood(30);

        for (Cat cat : cats){
            cat.eating(bowl);
        }

        System.out.println(bowl.getFood());

        for (Cat cat : cats){
            System.out.println(cat);
        }

    }
}
