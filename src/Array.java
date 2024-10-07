public class Array {
    public int findFirst (int[] arr, int x) { //метод возвращает индекс первого вхождения числа x в массив arr
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) return i;
        }
        return  -1;
    }
    public int maxAbs (int[] arr) { //метод возвращает наибольший по модулю элемент массива
        if (arr.length == 1) return arr[0];
        int max_abs = -1;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max_abs)) max_abs = arr[i];
        }
        return max_abs;
    }
    public int[] add (int[] arr, int[] ins, int pos) { //метод возвращает новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins
        int[] add_arr = new int[arr.length+ins.length];
        for (int i = 0; i < pos; i++) {
            add_arr[i] = arr[i];
        }
        for (int i = pos; i < pos+ins.length; i++) {
            add_arr[i] = ins[i-pos];
        }
        for (int i = pos+ins.length; i < add_arr.length; i++) {
            add_arr[i] = arr[i- ins.length];
        }
        return add_arr;
    }
    public int[] reverseBack (int[] arr) { //метод возвращает перевернутый массив
        int len = arr.length;
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr2[i] = arr[len-i-1];
        }
        return arr2;
    }
    public int[] findAll (int[] arr, int x) { //метод возвращает массив с найденными индексами
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) count++;
        }
        int[] arr_find = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                arr_find[count] = i;
                count++;
            }
        }
        return arr_find;
    }
}
