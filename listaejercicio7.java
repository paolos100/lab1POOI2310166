import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = leer.nextDouble();

        System.out.print("La nota con la que deseas terminar el trimestre: ");
        double notaDeseada = leer.nextDouble();

        double notaSegundoExamen = (notaDeseada - (0.4 * notaPrimerExamen)) / 0.6;

        System.out.println("Para tener un " + notaDeseada + " en el trimestre, debes sacar un " + notaSegundoExamen + " en el segundo examen.");
    }
}
