package javapractice;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Sorted {

    static class Element implements Comparable<Element> {
        int value;
        int row;
        int col;

        Element(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Element other) {
            return Integer.compare(this.value, other.value);
        }
    }

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

        printSortedMatrix(matrix, rows, cols);
    }

    public static void printSortedMatrix(int[][] matrix, int rows, int cols) {
        PriorityQueue<Element> minHeap = new PriorityQueue<>();

        for (int i = 0; i < rows; i++) {
            if (cols > 0) {
                minHeap.add(new Element(matrix[i][0], i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            Element current = minHeap.poll();
            System.out.print(current.value + " ");

            int nextCol = current.col + 1;
            if (nextCol < cols) {
                minHeap.add(new Element(matrix[current.row][nextCol], current.row, nextCol));
            }
        }
    }
}
