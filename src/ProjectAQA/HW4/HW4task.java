package ProjectAQA.HW4;

public class HW4task {
    public static void main(String[] args) {

        int number = -32;

        System.out.println(checkOddEven(number));
        System.out.println("BYE");

    }
    public static String checkOddEven(int number) {


        if (number %2 !=0)
            return ("Odd Number");
        else
            return ("Even Number");

    }

}
