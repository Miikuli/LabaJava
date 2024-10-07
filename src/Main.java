import java. util. Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задание 1. Методы
        Methods methods = new Methods();

        //вызов метода fraction
        System.out.println("Введите вещественное число (Пример ввода: 5,25):");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: Вы ввели не дробное число, пожалуйста, введите ещё раз (Пример ввода: 5,25):");
            scanner.next();
        }
        System.out.println("Его дробная часть: " + methods.fraction(scanner.nextDouble()));

        //вызов метода charToNum
        System.out.println("Введите символ от 0 до 9");
        scanner.nextLine(); //добавлено, чтобы очистить ввод
        char num = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                num = input.charAt(0);
                if (num >= '0' && num <= '9') {
                    break;
                }
            }
            System.out.println("Ошибка: введите корректный символ от '0' до '9'.");
        }
        System.out.println("Соответствующее число: " + methods.charToNum(num));

        //вызов метода is2Digits
        System.out.println("Введите целое число, чтобы узнать двузначное ли оно: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        if (methods.is2Digits(scanner.nextInt())) System.out.println("Да, число - двузначное");
        else System.out.println("Нет, число не двузначное");

        //вызов метода isInRange
        System.out.println("Введите границы диапазона: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        int a = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        int b = scanner.nextInt();
        System.out.println("Теперь введите число, чтобы узнать, входит ли оно в диапазон: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        if (methods.isInRange(a, b, number)) System.out.println("Да, число входит в диапазон");
        else System.out.println("Нет, число не входит диапазон");

        //вызов метода isEqual
        System.out.println("Введите 3 целых числа, чтобы проверить, равны ли они друг другу: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        a = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        b = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        if (methods.isEqual(a, b, number)) System.out.println("Да, числа равны");
        else System.out.println("Нет, числа не равны");



        //Задание 2. Условия
        Conditions conditions = new Conditions();

        //вызов метода abs
        System.out.println("Введите целое число, чтобы получить его модуль");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        System.out.println("Модуль числа: " + conditions.abs(scanner.nextInt()));

        //вызов метода is35
        System.out.println("Введите целое число, чтобы понять кратно ли оно 3 или 5 и не кратно и 3, и 5 одновременно");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        if (conditions.is35(number)) System.out.println("Да, число кратно 3 или 5, но не кратно и 3, и 5 одновременно");
        else System.out.println("Нет, число не кратны 3, или 5, или и 3, и 5 одновременно");

        //вызов метода max3
        System.out.println("Введите 3 целых числа, чтобы узнать, какое из них больше");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        a = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        b = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        System.out.println("Максимальное из чисел: " + conditions.max3(a, b, number));

        //вызов метода sum2
        System.out.println("Введите 2 целых числа, чтобы вычислить их сумму, сумма в диапазоне от 10 до 19 будет огбозначена как 20: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        a = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        b = scanner.nextInt();
        System.out.println("Сумма чисел: " + conditions.sum2(a, b));

        //вызов метода day
        System.out.println("Введите номер, чтобы узнать, какой это день недели (номер должен быть целым числом: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        System.out.println(conditions.day(scanner.nextInt()));



        //Задание 3. Циклы
        Cycles cycles = new Cycles();

        //вызов метода listNums
        System.out.println("Введите целое положительное число x, чтобы увидеть последовательность от 0 до x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        System.out.println(cycles.listNums(scanner.nextInt()));

        //вызов метода chet
        System.out.println("Введите целое положительное число x, чтобы увидеть последовательность четных чисел от 0 до x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        System.out.println(cycles.chet(scanner.nextInt()));

        //вызов метода numLen
        System.out.println("Введите целое число x, чтобы узнать кол-во знаков в числе x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        System.out.println(cycles.numLen(scanner.nextInt()));

        //вызов метода square
        System.out.println("Введите целое положительное число x, чтобы увидеть квадрат из * размером x на x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        cycles.square(scanner.nextInt());

        //вызов метода rightTriangle
        System.out.println("Введите целое положительное число x, чтобы увидеть правый треугольник из * размером x на x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        cycles.rightTriangle(scanner.nextInt());



        //Задание 4. Массивы
        Array array = new Array();

        //вызов метода findFirst
        System.out.println("Введите кол-во элементов массива, который собираетесь ввести: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("Теперь введите число, индекс первого вхождения которого хотите узнать");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        a = scanner.nextInt();
        System.out.println("Первое вхождение числа на индексе: " + array.findFirst(arr, a));

        //вызов метода maxAbs
        System.out.println("Введите кол-во элементов массива, который собираетесь ввести, чтобы узнать максимальное по модуля число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        arr = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("Максимальное по модулю число: " + array.maxAbs(arr));

        //вызов метода add
        System.out.println("Введите кол-во элементов первого массива, который собираетесь ввести: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        arr = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите кол-во элементов второго массива, который собираетесь ввести: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        int[] arr2 = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Теперь введите позицию, на которую хотите вставить второй массив");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        a = scanner.nextInt();
        System.out.println("Получившийся массив: ");
        int[] add_arr = new int[arr.length+arr2.length];
        add_arr = array.add(arr, arr2, a);
        for (int i = 0; i < add_arr.length; i++) {
            System.out.print(add_arr[i] + " ");
        }
        System.out.println();

        //вызов метода reverseBack
        System.out.println("Введите кол-во элементов массива, который собираетесь перевернуть: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        arr = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        System.out.println("Получившийся массив: ");
        add_arr = new int[arr.length];
        add_arr = array.reverseBack(arr);
        for (int i = 0; i < add_arr.length; i++) {
            System.out.print(add_arr[i] + " ");
        }
        System.out.println();

        //вызов матода findAll
        System.out.println("Введите кол-во элементов массива, который собираетесь ввести: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();
        arr = new int[number];
        System.out.println("Теперь поочередно введите целочисленные элементы массива: ");
        for (int i = 0; i < number; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Вы ввели не целое число, пожалуйста, введите ещё раз: ");
            scanner.next();
        }
        number = scanner.nextInt();

        System.out.println("Массив с индексами всех вхождений x: ");
        add_arr = new int[arr.length];
        add_arr = array.findAll(arr, number);
        for (int i = 0; i < add_arr.length; i++) {
            System.out.print(add_arr[i] + " ");
        }
    }
}