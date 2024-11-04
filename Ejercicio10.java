import java.util.Scanner;

public class Ejercicio10 {
    /*
     * Media Aritmética
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Media");

        System.out.println("Ingrese 3 números:");
        System.out.print("Número 1: ");
        double number1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double number2 = sc.nextDouble();
        System.out.print("Número 3: ");
        double number3 = sc.nextDouble();

        double addition = number1 + number2 + number3;

        double media = addition / 3; // 3 es el total de los números ingresados

        System.out.println("La media de los números "+number1+", "+number2+", "+number3+" es de: "+ media);

        sc.close();

     }
}
