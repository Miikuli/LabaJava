public class Conditions {

    public int abs (int x) { //метод возвращает модуль числа
        if (x>=0) return x;
        else return -x;
    }
    public boolean is35 (int x) { //метод делится нацело на 3 или 5, при этом, если оно делится и на 3, и на 5
        if (((x % 3 == 0) || (x % 5 == 0)) && (x % 15 != 0)) return true;
        return false;
    }
    public int max3 (int x, int y, int z) { //метод возвращает максимальное из чисел
        if (x >= y && x >= z) return x;
        if (y >= z) return y;
        return z;
    }
    public int sum2 (int x, int y) { // метод возвращает сумму двух чисел, но если сумма входит в диапазон он 10 до 19, то возвращает 20
        int sum = x + y;
        if (sum > 9 && sum < 20) return 20;
        return sum;
    }
    public String day (int x) { //метод возвращает день недели по его номеру
        switch (x) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
        }
        return "Это не день недели";
    }
}
