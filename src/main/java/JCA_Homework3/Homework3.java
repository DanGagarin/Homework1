package JCA_Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        //Написать программу, которая загадывает случайное число от 0 до 9
        // и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
        // чем загаданное, или меньше. После победы или проигрыша выводится запрос –
        // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int TRIES = 3;

        while (true){System.out.println("Please enter the bound of numbers >>");
        int numberAI = random.nextInt(scanner.nextInt());
        boolean playerGuessed = false;
        for (int i = 0; i < TRIES; i++) {
            System.out.println("Guess the number >>");
            int answer = scanner.nextInt();
            if (answer == numberAI) {
                System.out.println("You WIN!");
                playerGuessed = true;
                break;
            }else if (answer > numberAI) {
                System.out.println("Your number must be less");
            } else {
                System.out.println("Your number must be larger");
            }}
            if (!playerGuessed)System.out.println("You loose..");
            System.out.println("Wanna play again? Enter y or n >>");
            if (!scanner.next().toLowerCase().equals("y")) break;

        }


    }

    //Создать массив из слов:
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
    // "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    // "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
    // с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано,
    // компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное, apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple";
    //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово.
    //Используем только маленькие буквы.

    public static void guessTheWord(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String wordAI = words[random.nextInt(words.length)];
        System.out.println(wordAI);
        String wordUser;
        char[] chars = new char[15];
        Arrays.fill(chars, '#');

        System.out.println("Please guess some word from these >>");
        System.out.println(Arrays.toString(words));

        while (true){
            System.out.println("Enter your guess >>");
            wordUser = scanner.next();

            if (wordUser.toLowerCase().equals(wordAI)){
                System.out.println("You WIN!");
                break;
            }
            for (int i = 0; i < wordUser.length() && i < wordAI.length(); i++) {
                if (wordUser.charAt(i) == wordAI.charAt(i)) chars[i] = wordAI.charAt(i);
            }
            System.out.println("Fail.. You guess only these letters >>");
            System.out.println(new String(chars));
        }


    }
}
