import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Считываем размер массива
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            int countZeros = 0;

            // 2. Считываем элементы массива и сразу проверяем на ноль
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] == 0) {
                    countZeros++;
                }
            }

            // 3. Выводим результат
            System.out.println(countZeros);
        }
    }
}
