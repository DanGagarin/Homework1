package JCA_Homework8;

public class Human implements Participant{
    private  String name;
    public  int maxRun;
    public  int maxJump;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) { return this.maxRun >= length; }
    @Override
    public boolean jump(int height) { return this.maxJump >= height; }
    @Override
    public  String getName() { return this.name; }
}
