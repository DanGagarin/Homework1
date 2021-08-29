package JCA_Homework6;

public class Marathon {
    private static Object Animals;

    public static void main(String[] args) {
        Animal[] Animals ={
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Dog("Bobik", 300, 10),
                new Dog("Tuzik", 500, 20)
        };

        for (Animal a : Animals){
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(200);
            a.swim(10);
        }

        System.out.println("There were " + Cat.getCounter() + " Cats");
        System.out.println("There were " + Dog.getCounter() + " Dogs");
        System.out.println("There were " + Animal.getCounter() + " Animals");
    }
}
