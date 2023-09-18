import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas a la semana: ");
        
        int horasTrabajadas = leer.nextInt();
        int tarifaPorHora = 12;
        
        int salarioSemanal = horasTrabajadas * tarifaPorHora;
        
        System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros.");

    }
}
