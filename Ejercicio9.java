import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversión de Temperaturas");

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32; 

        double kelvin = celsius + 273.15;

        System.out.println(celsius + " °C son " + kelvin + " K");
        System.out.println(celsius + " °C son " + fahrenheit + " °F");

        sc.close();

    }

}
