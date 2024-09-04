package javapractice;

import java.util.Scanner;

public class maximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxRow = findRowWithMaxOnes(matrix, rows, cols);

        System.out.println("Row with maximum number of 1s is: " + maxRow);
    }

    public static int findRowWithMaxOnes(int[][] matrix, int rows, int cols) {
        int maxRowIndex = -1;
        int maxCount = 0;

        int j = cols - 1;

        for (int i = 0; i < rows; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}