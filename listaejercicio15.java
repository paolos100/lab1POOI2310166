import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int combinacion = 2310;
        int intentosMaximos = 4;
        
        Scanner leer = new Scanner(System.in);
        
        for (int intentos = 1; intentos <= intentosMaximos; intentos++) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int intento = leer.nextInt();
            
            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; 
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                if (intentos < intentosMaximos) {
                    System.out.println("Te quedan " + (intentosMaximos - intentos) + " intentos.");
                } else {
                    System.out.println("Has agotado todos los intentos. La caja fuerte permanece cerrada.");
                }
            }
        }

    }
}
