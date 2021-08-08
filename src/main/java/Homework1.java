import java.sql.SQLOutput;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Task3: ");
        System.out.println(calculateFloat(1f, 2f, 3f, 4f));
        System.out.println("Task4: ");
        System.out.println(trueOrFalse(5, 10));
        System.out.println("Task5: ");
        positiveOrNegative(5);
        System.out.println("Task6: ");
        System.out.println(isNegative(5));
        System.out.println("Task7: ");
        greetings("Vasya");
        System.out.println("Task8: ");
        System.out.println(leapYear(2021));



    }

    //Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void exercise2() {
        byte val1 = 0;
        short val2 = 1;
        int val3 = 10;
        long val4 = 100000L;
        double val5 = 12.34;
        float val6 = 12.34f;
        char val7 = 'C';
        boolean val8 = true;
        String val9 = "String";
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculateFloat(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean trueOrFalse(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static int positiveOrNegative(int a) {
        if (a < 0) {
            System.out.println(a + " is NEGATIVE");
        } else if (a >= 0) {
            System.out.println(a + " is POSITIVE");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;}
        else {
            return false;
        }
        }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greetings(String name) {
        System.out.println("Привет," + name);
    }

    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }



    }
