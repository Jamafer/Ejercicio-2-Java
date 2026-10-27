import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Crear un generador de números aleatorios
        Random aleatorio = new Random();

        // Generar un número aleatorio entre 1 y 20
        int m = aleatorio.nextInt(20) + 1;

        // Variable para almacenar la suma
        int suma = 0;

        // Mostrar el número generado
        System.out.println("Número generado: " + m);

        // Sumar los números desde 1 hasta m
        for (int i = 1; i <= m; i++) {
            suma += i;
        }

        // Mostrar el resultado final
        System.out.println("La suma de los números enteros entre 1 y "
                + m + " es: " + suma);
    }
}