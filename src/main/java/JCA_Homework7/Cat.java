package JCA_Homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public boolean eating(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            System.out.printf("Cat %s ate %d food\n", this.name, this.appetite);
            this.fullness = true;
            return true;
        }
        System.out.printf("Cat %s not enough food %d - needed, %d - present\n", this.name, this.appetite, bowl.getFood());
        return false;
    }

        public String getName () {
            return name;
        }

        public int getAppetite () {
            return appetite;
        }

        @Override
    public String toString(){
        return "Cat{" +
                "name='" + name + '\'' + ", fullness=" + fullness + '}';
        }
    }