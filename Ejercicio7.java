import java.util.Scanner;

public class Ejercicio7 {
    /*
     * Calculadora Básica
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Básica");
        System.out.println("Ingrese dos números");

        double number1;
        double number2;
        int operation;

        System.out.print("Número 1: ");
        number1 = sc.nextDouble();

        System.out.print("Número 2: ");
        number2 = sc.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        System.out.print("Que desea realizar: ");
        operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = number1 + number2;
                System.out.println("Resultado: " + number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Resultado: " + number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Resultado: " + number1 + " * " + number2 + " = " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Resultado: " + number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("No se puede dividir entre 0 ");
                }
                break;
            default:
                System.out.println("Opción no valida");
                break;

        }

        sc.close();
    }
}
