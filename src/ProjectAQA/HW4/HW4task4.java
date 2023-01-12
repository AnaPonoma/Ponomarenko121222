package ProjectAQA.HW4;

public class HW4task4 {

    public static void main(String[] args) {

        int a = 9;
        int b = 9;
        int c=8;
        System.out.println(prntResult(a,b,c));

    }
    public static String prntResult(int a, int b, int c)
    {
        String str;
        if (a==b && b==c)
        return str="A=B=C triangle";
        else
return str="Non-equal triangle";
        }

    }


//str =(Math.abs(first)>Math.abs(second))? (String.valueOf(first)+" Bigger value") :
//                (String.valueOf(first)+" Smaller value");
//return str;