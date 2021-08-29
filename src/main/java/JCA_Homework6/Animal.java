package JCA_Homework6;

public class Animal {
    private static int counter;
    private String type;
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(){ counter++; }

    public Animal(String type, String name, int maxRun, int maxSwim){
        this();
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRun;
        this.maxSwimDistance = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.printf("%s %s run %d meters\r\n", type, name, distance);
        }else System.out.printf("%s %s could not run %d meters\r\n", type, name, distance);
    }

    public void swim(int distance){
        if (distance <= maxSwimDistance){
            System.out.printf("%s %s swim %d meters\r\n", type, name, distance);
        }else System.out.printf("%s %s could not swim %d meters\r\n", type, name, distance);
    }

    public String getType(){ return type; }

    public void setType(String type){ this.type = type; }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public int getMaxRunDistance(){ return maxRunDistance; }

    public void setMaxRunDistance(int maxRunDistance){ this.maxRunDistance = maxRunDistance; }

    public int getMaxSwimDistance(){ return maxSwimDistance; }

    public void setMaxSwimDistance(int maxSwimDistance){ this.maxSwimDistance = maxSwimDistance; }

    public static int getCounter(){ return counter; }

}
