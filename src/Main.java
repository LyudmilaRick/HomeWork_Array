import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Для получения массива случайных чисел
        int[] arr = generateRandomArray();
        System.out.println("Весь массив данных ");
        for (int item : arr) {
            System.out.println(item);
        }
        System.out.print("\n");
        // Задание 1
        System.out.println("Задание 1");
        int sumMonth = 0;
        for (int item : arr) {
            sumMonth += item;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");
        // Задание 2
        System.out.println("Задание 2");
        int maxMonth = 0;
        int minMonth = arr[0];
        for (int item : arr) {
            if (item < minMonth) {
                minMonth = item;
                continue; // нет смысла проверять на максимум
            }
            if (item > maxMonth) {
                maxMonth = item;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMonth + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxMonth + " рублей");
        // Задание 3
        System.out.println("Задание 3");
        int numDays = 30;
        float sumMonthFloat = 0f;
        for (int item : arr) {
            sumMonthFloat += item;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumMonthFloat / numDays + " рублей");
        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char letter : reverseFullName) {
            System.out.print(letter);
        }
        System.out.print("\n");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        // Задание 5
        System.out.print("\n");
        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        int digitExample = 1;
        // Эаполнение
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = digitExample;
            matrix[i][matrix.length - i - 1] = digitExample;
        }
        // Печать
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        // Задание 6
        System.out.print("\n");
        System.out.println("Задание 6");
        int[] firstArray = {5, 8, 2, 3, 9};
        int[] secondArray = new int[firstArray.length];
        System.out.println("Массив до обработки " + Arrays.toString(firstArray));
        for (int i = firstArray.length - 1; i >= 0; i--) {
            secondArray[Math.abs(i - firstArray.length + 1)] = firstArray[i];
        }
        System.out.println("Массив после обработки( дополнительный массив ) " + Arrays.toString(secondArray));
        // Задание 7
        System.out.print("\n");
        System.out.println("Задание 7");
        System.out.println("Массив до обработки " + Arrays.toString(firstArray));
        for (int i = 0; i < firstArray.length; i++) {
            // одна итерация = один сдвиг
            int tmpValue = firstArray[0];
            for (int j = 1; j < firstArray.length - i; j++) {
                firstArray[j - 1] = firstArray[j];
            }
            firstArray[firstArray.length - 1 - i] = tmpValue;
        }
        System.out.println("Массив после обработки " + Arrays.toString(firstArray));
        // Задание 9
        System.out.print("\n");
        System.out.println("Задание 9");
        int sumSearch = -2;
        System.out.println("Пары чисел, дающих в сумме " + sumSearch);
        int[] arrayForSearch = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arrayForSearch.length; i++) {
            for (int j = i + 1; j < arrayForSearch.length; j++) {
                if (arrayForSearch[i] + arrayForSearch[j] == sumSearch) {
                    System.out.println(arrayForSearch[i] + " " + arrayForSearch[j]);
                }
            }
        }
        // Задание 8. Как частный случай Задания 9
        System.out.print("\n");
        System.out.println("Задание 8");
        System.out.println("Первая пара  чисел, дающих в сумме " + sumSearch);
        Arrays.sort(arrayForSearch);  // для уменьшения перебора
        boolean pairExist = false;
        for (int i = 0; i < arrayForSearch.length; i++) {
            for (int j = i + 1; j < arrayForSearch.length; j++) {
                if (arrayForSearch[i] + arrayForSearch[j] == -2) {
                    System.out.println(arrayForSearch[i] + " " + arrayForSearch[j]);
                    pairExist = true;
                    break;
                }
                if (arrayForSearch[i] + arrayForSearch[j] > -2) {
                    break; // исключаю лишние мтерации. остановка внутренего цикла
                }
            }
            if (pairExist){ break; }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
