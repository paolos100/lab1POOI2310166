import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        int valorAbsoluto;
        int contadorDigitos;

        do {
            System.out.print("Introduce un número entero de hasta 5 dígitos: ");
            numero = leer.nextInt();

            valorAbsoluto = Math.abs(numero);

            contadorDigitos = 0;

            while (valorAbsoluto > 0) {
                valorAbsoluto /= 10; 
                contadorDigitos++;
            }

            if (contadorDigitos > 5) {
                System.out.println("El número tiene más de 5 dígitos. Introduce un número válido.");
            }

        } while (contadorDigitos > 5);

        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");
    }
}
