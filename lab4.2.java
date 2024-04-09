 import java.util.Random;
 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Введіть розмірність квадратної матриці: ");
         int n = scanner.nextInt();

         double[][] matrix = generateRandomMatrix(n);
         printMatrix(matrix);

         double minElement = findMinAboveSecondaryDiagonal(matrix);
         System.out.println("Мінімальний елемент серед елементів, які знаходяться вище бічної діагоналі: " + minElement);
     }

     // Генерує випадкову квадратну матрицю розмірності n x n
     public static double[][] generateRandomMatrix(int n) {
         double[][] matrix = new double[n][n];
         Random random = new Random();

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 matrix[i][j] = random.nextDouble() * 200 - 100; // Генерує випадкове число в діапазоні [-100, 100]
             }
         }

         return matrix;
     }

     // Знаходить мінімальний елемент серед елементів, які знаходяться вище бічної діагоналі
     public static double findMinAboveSecondaryDiagonal(double[][] matrix) {
         int n = matrix.length;
         double min = Double.MAX_VALUE;

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (i + j < n - 1) { // Перевірка чи елемент знаходиться вище бічної діагоналі
                     if (matrix[i][j] < min) {
                         min = matrix[i][j];
                     }
                 }
             }
         }

         return min;
     }

     // Виводить матрицю на екран
     public static void printMatrix(double[][] matrix) {
         int n = matrix.length;

         System.out.println("Квадратна матриця:");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(matrix[i][j] + "\t");
             }
             System.out.println();
         }
     }
 }
