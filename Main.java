package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //No.3. Draw a  square from "*", which borders consist of 25 "*".
        System.out.println("_____Third task (a)_____");
        int e;
        int s;
        for (e = 1; e <= 25; e++) {
            for (s = 1; s <= 25; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____Third task (b, example)_____");
        int countRow = 3;
        int countColumn = 5;
        for (int r = 0; r < countRow; r++) {
            for (int c = 0; c < countColumn; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //No.4. For the previously drawn square, draw diagonals by replacing "*" with another symbol.
        System.out.println("_____Fourth task_____");

        for (int y = 0; y < 15; y++) {
            String row = "";
            for (int x = 0; x < 15; x++) {
                if ((x == y) || (x + y == 14))
                    row += "5";
                else
                    row += "*";
            }
            System.out.println(row);
        }
    }
}