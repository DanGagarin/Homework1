package JCA_Homework8;

public class Championship {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Kotik",300,200),
                new Cat("Kisa",400,300),
                new Robot("R2D2",9999,200),
                new Robot("C3PO",666,120),
                new Human("Han",555,35),
                new Human("Luke",6666,150)
        };

        Trap[] traps = {
                new Track (300),
                new Wall(45),
                new Track(2000),
                new Wall(10),
                new Track(250),
                new Wall(15)
        };

        for (Participant p : participants){
            for (Trap t : traps){
                if (!t.overcome(p)) break;
            }
        }
    }
}
