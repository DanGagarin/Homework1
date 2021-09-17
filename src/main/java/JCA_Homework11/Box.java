package JCA_Homework11;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList<>();

    public float getWeight(){
        if(fruits.size() > 0){
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0F;
    }

    public boolean compare(Box<?extends Fruit> other){
        return getWeight() == other.getWeight();

    }


}
