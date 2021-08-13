package JCA_Homework2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Task1: ");
        task1();
        System.out.println("Task2: ");
        task2();
        System.out.println("Task3: ");
        task3();
        System.out.println("Task4: ");

    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void task2(){
        int[] arr = new int[8];
        for (int i = 0; i < 24; i += 3) {
            System.out.print(i + " ");
        }

    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static int[] task3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] task4(int[][] arr) {
        int[][] arrr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 4;
            arr[i][arr.length - 1 - i] = 4;
        }
        return arrr;

    }

    //** Задать одномерный массив и найти в нем минимальный
    // и максимальный элементы (без помощи интернета);
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[1]) min = arr[i];
            
        }return min;

    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[1]) max = arr[i];

        }return max;

    }

    //** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором
    // сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.

}
