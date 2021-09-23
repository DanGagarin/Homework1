package JCA_Homework7;

public class Bowl {
    private int food;

    public void putFood(int amount) {
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount, this.food);
    }

    public boolean decreaseFood(int amount){
        if (this.food < amount) {
            System.out.printf("There not enough food, %d now, %d U want\n", this.food, amount);
            return false;
        }
        this.food -= amount;
        System.out.printf("Food decreased for %d, now: %d\n", amount, this.food);
        return  true;
    }

    public int getFood(){ return  food; }
}
