import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el límite superior (número positivo): ");
        int limiteSuperior = leer.nextInt();

        System.out.print("Ingresa el número por el cual no deben ser divisibles: ");
        int divisor = leer.nextInt();

        if (limiteSuperior <= 0 || divisor == 0) {
            System.out.println("Por favor, ingresa números válidos.");
        } else {
            System.out.println("Números enteros positivos menores a " + limiteSuperior +
                               " que no son divisibles por " + divisor + ":");

            for (int i = 1; i < limiteSuperior; i++) {
                if (i % divisor != 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
