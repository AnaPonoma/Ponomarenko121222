package ProjectAQA.HW4;

public class HW4task3 {

    public static void main(String[] args) {

        int first = 9;
        int second = -6;
        System.out.println(prntResult(first,second));

    }
    public static String prntResult(int first, int second) {
        String str;
        str =(Math.abs(first)>Math.abs(second))? (String.valueOf(first)+" Bigger value") :
                (String.valueOf(first)+" Smaller value");
return str;
        }

    }


// if (( (Math.abs(first)>Math.abs(second)) ) ? str ="Bigger value" : str ="Smaller value")
//        return str;
//            else  str= "Equal values";
//        return str;