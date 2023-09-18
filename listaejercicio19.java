import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la altura de la letra L: ");
        int altura = leer.nextInt();

        if (altura <= 0) {
            System.out.println("La altura debe ser un número positivo.");
        } else {
            System.out.println("La letra L con altura " + altura + ":");

            for (int i = 1; i <= altura; i++) {
                if (i < altura) {
                    System.out.println("*");
                } else {
                    for (int j = 1; j <= altura / 2 + 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(); 
                }
            }
        }

    }
}
