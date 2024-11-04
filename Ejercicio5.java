public class Ejercicio5 {

    /*
     * PC Gamer de 660 euros con todos los accesorios incluidos
     * Tiene descuento del 10% por pronto pago
     */

    public static void main(String[] args) {

        double pcPrice = 660;
        double percentage = 0.10; // Descuento del 10%
        double discount = pcPrice * percentage;

        double finalPrice = pcPrice - discount;

        System.out.println("Precio normal del PC Gamer: " + pcPrice+ " euros");
        System.out.println("Total del descuento del 10% por pronto pago: "+ discount+ " euros");
        System.out.println("Total del PC Gamer con descuento: " + finalPrice + " euros");
        System.out.println("Aprovecha y compralo ya !!! ;) ");

    }

}
