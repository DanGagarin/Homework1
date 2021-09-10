package JCA_Homework9;

public class Main {
    public static void main(String[] args) {
        String val [][] = {
                { "1", "2", "3", "4"},
                { "1", "2", "3"},
                { "1", "2", "3", "4"},
                { "1", "2", "3", "4"}
        };

    }

    static int calcSum (String[][] values){
        checkSize(values);
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("Non parsable integer. Values [$s][%s]", i, j);
                    throw new MyArrayDataException(message, e);
                }
            }
        }
        return sum;
    }

    static void checkSize(String[][] values){
        checkSize(values.length);
        for (int i = 0; i < values.length; i++) {
            checkSize(values[i].length);

        }
    }

    static void checkSize (int length){
        if (length != 4){
            throw new MyArraySizeException("Size must be 4X4");

        }

    }

}
