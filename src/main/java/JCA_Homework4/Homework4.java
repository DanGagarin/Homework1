package JCA_Homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    private static Scanner SCANNER = new Scanner(System.in);
    private static Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';
    private static char [][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int winLength;

    public static void main(String[] args) {
        while (true){
            playRound();
            System.out.println("Do YOU want play again? Enter y or n >>");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }

    private static void playRound() {
        initField(3,3, 3);
        printField();
        while (true){
            humanTurn();
            printField();
            if (checkState(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkState(DOT_AI)) break;
        }
    }

    private static boolean checkState(char dot){
        if (checkDraw()) return true;

        if (checkWin(dot, winLength)){
            if (dot == DOT_HUMAN){
                System.out.println("You WIN!");
            }else {
                System.out.println("AI WIN!");
            }return true;
        }return false;
    }

    private static boolean checkDraw() {
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (emptyCell(x, y)) return false;
            }
        }
        System.out.println("Its DRAW..");
        return true;
    }

    private static boolean checkWin(char dot, int length){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (checkLine(x, y, 1, 0, length, dot)) return true;
                if (checkLine(x, y, 1, 1, length, dot)) return true;
                if (checkLine(x, y, 0, 1, length, dot)) return true;
                if (checkLine(x, y, 1, -1, length, dot)) return true;
            }
        }
        return false;
    }

    private static boolean checkLine(int x, int y, int incrementX, int incrementY, int len, char dot){
        int endXLine = x + (len - 1) * incrementX;
        int endYLine = y + (len - 1) * incrementY;
        if(!validCell(endXLine, endYLine))return false;
        for (int i = 0; i < len; i++) {
            if (field[x + i * incrementX][y + i * incrementY] != dot) return false;
        }
        return true;
    }

    private static void humanTurn(){
        int x, y;
        do{
            System.out.println("Please enter x & y coordinates of your move trough a space >>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }while(!validCell(x,y) || !emptyCell(x,y));
        field[x][y] = DOT_HUMAN;
    }

    private static void aiTurn(){
        int x , y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        }while(!emptyCell(x,y));
        field[x][y] = DOT_AI;
    }

    private static boolean validCell(int x, int y){
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean emptyCell(int x, int y){
        return field[x][y] == DOT_EMPTY;
    }

    private static void initField(int sizeX, int sizeY, int len){
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        winLength = len;
        field = new char[fieldSizeX][fieldSizeY];
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                field[x][y] = DOT_EMPTY;
            }
        }
    }

    private static void printField(){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                System.out.print(field[x][y] + " ");
            }
            System.out.println();
        }
    }
}
