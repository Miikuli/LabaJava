public class Methods {
    public double fraction (double x) { //метод возвращает дробную часть числа
        return(x % 1);
    }
    public int charToNum(char x) { //метод преобразует чимвол от 0 до 9 в число
        return x - '0';
    }
    public boolean is2Digits (int x) { //метод выясняет двузначное число или нет
        return (x > 9 && x < 100);
    }
    public boolean isInRange (int a, int b, int num) { //метод выясняет, входит ли число в диапазон
        return ((num - a) * (num - b) <= 0);
    }
    public boolean isEqual(int a, int b, int c) { //метод выясняет, равны ли 3 числа друг другу
        return (a == b && b == c);
    }
}
