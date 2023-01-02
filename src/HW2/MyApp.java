
package HW2;

public class MyApp {
    public static void main(String[] args) {

        double Celsius = -20;
        double Farenheit = 32 + Celsius*9/5;
        double Kelvin = Celsius + 273.16;

        System.out.print(Celsius);
        System.out.print("C;");
        System.out.print(Farenheit);
        System.out.print("F;");
        System.out.print(Kelvin);
        System.out.print("K");

    }
}