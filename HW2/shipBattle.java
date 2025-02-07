package HW2;

import java.util.Random;
import java.util.Scanner;

public class shipBattle {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 5;
        char[][] arr = {
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'}
        };
        System.out.println("All set. Get ready to rumble!");
        int targetRow = random.nextInt(size);
        int targetCol = random.nextInt(size);
        while (true) {
            System.out.printf("Enter row (1-5): ");
            int row = new Scanner(System.in).nextInt();
            System.out.printf("Enter column (1-5): ");
            int col = new Scanner(System.in).nextInt();
            row--;
            col--;
            if (row >= 0 && row <= size && col >= 0 && col <= size) {
                if (row == targetRow && col == targetCol) {
                    arr[row][col] = 'x';
                    printBoard(arr);
                    System.out.println("You have won!");
                    break;
                } else {
                    if (arr[row][col] == '-') {
                        arr[row][col] = '*';
                    }
                    printBoard(arr);
                }
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
    private static void printBoard(char[][] board) {
        System.out.println("\nGame Board:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
