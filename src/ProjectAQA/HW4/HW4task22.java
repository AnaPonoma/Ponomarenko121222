package ProjectAQA.HW4;

public class HW4task22 {
    public static void main(String[] args) {

        int month = 3;
        System.out.println(prntMonth(month));

    }
    public static String prntMonth(int month) {
        String str;
        switch (month) {
            case 1:
                str = "Jan";
                break;
            case 2:
                str = "Feb";
                break;
            case 3:
                str = "Mar";
                break;
            case 4:
                str = "Apr";
                break;
            case 5:
                str = "May";
                break;
            case 6:
                str = "Jun";
                break;
            case 7:
                str = "Jul";
                break;
            case 8:
                str = "Aug";
                break;
            case 9:
                str = "Sept";
                break;
            case 10:
                str = "Oct";
                break;
            case 11:
                str = "Nov";
                break;
            case 12:
                str = "Dec";
                break;

            default:
                str= "Not a valid month";
        }
return str;
    }

}
