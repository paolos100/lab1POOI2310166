import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas: ");
        int horasTrabajadas = leer.nextInt();

        int tarifaHoraOrdinaria = 12;
        int tarifaHoraExtra = 16;

        int salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * tarifaHoraOrdinaria;
        } else {
            int horasOrdinarias = 40;
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (horasOrdinarias * tarifaHoraOrdinaria) + (horasExtras * tarifaHoraExtra);
        }

        System.out.println("El salario semanal es: " + salarioSemanal + " soles");
    }
}
