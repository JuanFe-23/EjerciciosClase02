import java.util.Scanner;

public class Ejercicio8 {
    /*
     * Área y Perímetro de un Rectángulo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Rectángulo");

        System.out.print("Digite el largo: ");
        double longRec = sc.nextDouble();

        System.out.print("Digite el ancho: ");
        double broad = sc.nextDouble();

        double area = longRec * broad;
        double perimeter = (2 * longRec) + (2 * broad);

        System.out.println("El area es de: " + area);
        System.out.println("El perimetro es de: " + perimeter);

        sc.close();
        

        
    }
}
