import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadNumeros = 0;
        int sumaImpares = 0;
        int mayorPar = 0; 

        while (true) {
            System.out.print("Ingresa un número (ingresa un número negativo para finalizar): ");
            int numero = leer.nextInt();

            if (numero < 0) {
                break; 
            }

            cantidadNumeros++;

            if (numero % 2 != 0) {
                sumaImpares += numero;
            } else if (numero > mayorPar) {
                mayorPar = numero;
            }
        }

        int mediaImpares = 0;
        if (cantidadNumeros > 0 && sumaImpares > 0) {
            mediaImpares = sumaImpares / cantidadNumeros;
        }

        System.out.println("Cantidad de números ingresados: " + cantidadNumeros);
        
        if (cantidadNumeros > 0) {
            System.out.println("Media de los números impares: " + mediaImpares);
        } else {
            System.out.println("No se ingresaron números impares.");
        }

        if (mayorPar >= 0) {
            System.out.println("El mayor número par es: " + mayorPar);
        } else {
            System.out.println("No se ingresaron números pares.");
        }

    }
}
