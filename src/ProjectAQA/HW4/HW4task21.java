package ProjectAQA.HW4;

public class HW4task21 {
    public static void main(String[] args) {

        int month = 1;

        System.out.println(prntMonth(month));


    }

    public static String prntMonth(int month) {
        if (month == 1) {
            return ("Jan");
        } else if (month == 2) {
            return ("Feb");
        } else if (month == 3) {
            return ("Mar");
        } else if (month == 4) {
            return ("Apr");
        } else if (month == 5) {
            return ("May");
        } else if (month == 6) {
            return ("Jun");
        } else if (month == 7) {
            return ("Jul");
        } else if (month == 8) {
            return ("Aug");
        } else if (month == 9) {
            return ("Sept");
        } else if (month == 10) {
            return ("Oct");
        } else if (month == 11) {
            return ("Nov");
        } else if (month == 12) {
            return ("Dec");
        }
        return "Not a valid month";
    }

}
