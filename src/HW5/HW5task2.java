package HW5;

import java.util.Arrays;
import java.util.Random;

public class HW5task2 {
    public HW5task2() {
    }

    public static void main(String[] args) {
        int[] newArray = generateIntArray(3);
        System.out.println(Arrays.toString(newArray));
        int[] var2 = newArray;
        int var3 = newArray.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var2[var4];
            if (element % 2 != 0) {
                System.out.print(element);
                System.out.print(' ');
            } else {
                element = 0;
                System.out.print(element);
                System.out.print(' ');
            }
        }

    }

    public static int RandomValueArray() {
        Random random = new Random();
        int i = random.nextInt(100);
        return i;
    }

    public static int[] generateIntArray(int length) {
        int[] intArray = new int[length];

        for(int i = 0; intArray.length > i; ++i) {
            intArray[i] = RandomValueArray();
        }

        return intArray;
    }
}
