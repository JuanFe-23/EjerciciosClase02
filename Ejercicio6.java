public class Ejercicio6 {
    /*
     * Precio original sin descuento
     */
    public static void main(String[] args) {

        double finalPrice = 34; // Precio que pagó por los pantalones con descuento
        double discountPercentage = 0.15;

        double initialPrice = finalPrice / (1 - discountPercentage);

        double discountApplied = initialPrice - finalPrice;

        System.out.println("El precio inicial sin descuento es de: " + initialPrice + " euros");
        System.out.println("El descuento aplicado fue de: " + discountApplied + " euros");

       if(finalPrice == (initialPrice - discountApplied)){
        System.out.println("El precio pagado de: " + finalPrice + " euros, es correcto");
       } else {
        System.out.println("Algo está mal");
       }

    }
}
