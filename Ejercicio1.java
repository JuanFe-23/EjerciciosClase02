public class Ejercicio1 {
    public static void main(String[] args) {
        int result = 6 / 2 * ( 1 + 2);

        System.out.println("El resultado correcto es: " + result);

        /*
         * El primer paso, es resolver lo que está dentro de los parentesis.
         * (1 + 2) = 3
         * Nos queda  ->  6 / 2 * 3
         * Resolvemos las operaciones de izquierda a derecha, según este orden
         * Se resuelve primero la división y luego la multiplicación, dejando como resultado:
         *  3 * 3 = 9
         */

        int result2 = 6 / (2 * (1 + 2));

        System.out.println("El resultado de otra forma es: "+result2);

        /*
         * Para el segundo resultado, para que la respuesta sea 1, es necesario separar con parentesis. 
         * El primer paso es sumar (1 + 2) = 3
         * Luego vemos que nos queda 6 / (2 * (3)). 
         * Seguimos el orden de los parentesis, lo que nos da como resultado: (2 * (3)) = 6
         * Finalmente nos queda: 6 / 6 = 1 
         */

        
    }
}
