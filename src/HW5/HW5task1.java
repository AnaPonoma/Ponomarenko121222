package HW5;


public class HW5task1 {
    public HW5task1() {
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 360; i += 10) {
            System.out.println(i);
            System.out.println(SinusOp(i));
        }

    }

    public static String SinusOp(int i) {
        Double sinus = Math.sin((double)i);
        String str = String.valueOf(sinus);
        return str;
    }
}
