package JCA_Homework5;

public class Employee {
    private String name;
    private String position;
    private int pay;
    private int age;

    public Employee(String name, String position, int pay, int age) {
        this.name = name;
        this.position = position;
        this.pay = pay;
        this.age = age;
    }

    public int getAge() { return age; }

    public void printInfo(){
        System.out.printf("Employee: name %s, position %s, pay %s, age %s\n", name, position, pay, age);
    }
}
