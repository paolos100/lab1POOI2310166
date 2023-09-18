import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " no es un número par.");
        }

        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
        } else {
            System.out.println(numero + " no es divisible por 5.");
        }
    }
}
