public class Cycles {
    public String listNums (int x) { // метод возвращает строку, в которой записаны числа от 0 до x
        String str ="";
        for (int i = 0; i <= x; i++) {
            str = str + i + " ";
        }
        return str;
    }
    public String chet (int x) { //метод возвращает строку, в которой записаны четные числа от 0 до x
        String str ="";
        for (int i = 0; i <= x; i+=2) {
            str = str + i + " ";
        }
        return str;
    }
    public int numLen (long x) { //метод возвращает кол-во знаков в числе x
        int k = 0;
        if (x < 0) x = -x;
        if (x == 0) return 1;
        while (x > 0) {
            x /= 10;
            k++;
        }
        return k;
    }
    public void square (int x) { //метод возвращает квадрат из * размером x на x
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public void rightTriangle (int x) { //метод возвращает правый треугольник из * размером x на x
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - k; j++) {
                System.out.print(' ');
            }
            k++;
            for (int j = 0; j < k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
