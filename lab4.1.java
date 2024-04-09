 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування розмірності матриці з клавіатури
        System.out.print("Введіть кількість рядків (n): ");
        int n = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (m): ");
        int m = scanner.nextInt();

        // Оголошення та ініціалізація матриці розмірності nxm
        int[][] A = new int[n][m];

        // Зчитування елементів матриці з клавіатури
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Пошук максимального та мінімального елементів матриці
        int max = A[0][0];
        int min = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
        }

        // Обчислення середнього арифметичного максимального та мінімального елементів
        double avg = (double) (max + min) / 2;

        // Виведення результату
        System.out.println("Середнє арифметичне максимального та мінімального елементів матриці: " + avg);

        // Закриття Scanner
        scanner.close();
    }
}
