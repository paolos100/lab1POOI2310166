import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la hora (0-23): ");
        int horas = leer.nextInt();

        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = leer.nextInt();

        int segundosHastaMedianoche = calcularSegundosHastaMedianoche(horas, minutos);

        System.out.println("Segundos hasta la medianoche: " + segundosHastaMedianoche + " segundos");
    }

    public static int calcularSegundosHastaMedianoche(int horas, int minutos) {

        int segundosActuales = horas * 3600 + minutos * 60;
        int segundosHastaMedianoche = 86400 - segundosActuales;

        return segundosHastaMedianoche;
    }
}
