package JCA_Homework5;

public class Homework5 {

    public static void main(String[] args) {
        Employee[] employeeArray = {
            new Employee("Han", "pilot", 500, 33),
            new Employee("Luke", "jedi", 800, 30),
            new Employee("Mando","hunter", 999, 41),
            new Employee("Dart", "lord", 0, 55),
            new Employee("Chewee", "navigator", 450, 50)
        };

        ageFilter(employeeArray, 40);

    }

    static void ageFilter(Employee[] employeeArray, int age){
        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() < age){
                employeeArray[i].printInfo();

        }
    }
}}
