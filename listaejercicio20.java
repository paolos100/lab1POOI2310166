import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        long numero = leer.nextLong();

        long sumaPares = 0;
        String digitosPares = ""; 

        if (numero < 0) {
            numero = Math.abs(numero);
        }

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {

                sumaPares += digito;
                digitosPares = digito + digitosPares;
            }
            numero /= 10; 
        }

        if (digitosPares.equals("")) {
            System.out.println("No hay dígitos pares en el número.");
        } else {
            System.out.println("Dígitos pares: " + digitosPares);
            System.out.println("Suma de los dígitos pares: " + sumaPares);
        }

    }
}
