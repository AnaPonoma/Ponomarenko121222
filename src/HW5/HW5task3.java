package HW5;

import java.util.Arrays;
import java.util.Random;

public class HW5task3 {
    public HW5task3() {
    }

    public static void main(String[] args) {
        int summa = 0;
        int[] newArray = generateIntegerArr(10);
        System.out.println(Arrays.toString(newArray));

        for(int i = 0; i < newArray.length; ++i) {
            summa += newArray[i];
        }

        System.out.println(summa);
    }

    public static int RandomValueArr() {
        Random random = new Random();
        int i = random.nextInt(100);
        return i;
    }

    public static int[] generateIntegerArr(int length) {
        int[] intArray = new int[length];

        for(int i = 0; intArray.length > i; ++i) {
            intArray[i] = RandomValueArr();
        }

        return intArray;
    }
}
