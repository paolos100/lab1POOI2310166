import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la altura desde la que cae el objeto (en metros): ");
        double altura = leer.nextDouble();
        
        double g = 9.81;
        double tiempoCaida = Math.sqrt((2 * altura) / g);

        System.out.println("El tiempo que tardará en caer el objeto es: " + tiempoCaida + " segundos");
    }
}
