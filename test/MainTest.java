import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проверяем, есть ли число на входе, чтобы избежать ошибок
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int countZeros = 0;

            // Проходим циклом n раз
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    int currentNumber = scanner.nextInt();
                    // Если число равно 0, увеличиваем счетчик
                    if (currentNumber == 0) {
                        countZeros++;
                    }
                }
            }

            // Выводим итоговое количество нулей
            System.out.println(countZeros);
        }
        
        scanner.close(); // Закрываем поток ввода
    }
}
