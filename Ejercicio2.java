public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen.
         * Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
         * ¿Es correcto el precio?
         */

         double portionPrice = 5.95;
         double gramsPerPortion = 100;
         double gramsPerKilo = 1000;

         double pricePerKilo = (portionPrice * gramsPerKilo) / gramsPerPortion;

         System.out.println("El total del kilo es: " + pricePerKilo + " euros");

         // Comparación con el vendedor 

         double vendorPrice = 29.75;

         System.out.println("El precio del vendedor es de : " + vendorPrice);

         if(pricePerKilo == vendorPrice){
            System.out.println("El precio del vendedor fue correcto");
         } else { 
            System.out.println("El precio del vendedor fue incorrecto");
         }


                
    }
}
