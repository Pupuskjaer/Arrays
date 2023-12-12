import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Задание 1
        int [] array1 = new int []{1, 2, 3};
        float [] array2 = new float[]{1.57f, 7.654f, 9.986f};
        double [] array3 = {2.54d, 48.5128648688468486d };
        // Задание 2
        System.out.println("Задание 2");

        // вывод первого массива
        for (int i = 0; i < array1.length; i++) {
            if(i == array1.length-1){
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        // Вывод второго массива
        System.out.println(Arrays.toString(array2));

        // Вывод третьего массива
        for (int i = 0; i < array3.length; i++) {
            if(i == array3.length-1){
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        // Задание 3
        System.out.println("Задание 3");
        // Вывод первого массива
        for (int i = array1.length-1; i >= 0; i--) {
            if(i == 0){
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        // Вывод второго массива
        for (int i = array2.length-1; i >= 0; i--) {
            if(i == 0){
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        // Вывод третьего массива
        for (int i = array3.length-1; i >= 0; i--) {
            if(i == 0){
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]%2 != 0 ){
                array1[i] += 1;
            }
//            System.out.print(array1[i] + ", ");
        }
        System.out.println(Arrays.toString(array1));

    }
}