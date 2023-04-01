import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float temp = sc.nextInt();
        temp = ((temp - 32) * 5) / 9;
        System.out.println("Temperature in Celsius = " + temp);
    }
}
