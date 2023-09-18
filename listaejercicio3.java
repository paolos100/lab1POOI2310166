import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en euros a convertir: ");
        double euros = leer.nextDouble();
        
        double factorConversion = 166.386; 
        
        double pesetas = euros * factorConversion;
        
        System.out.println(euros + " euros equivale a " + pesetas + " pesetas.");
    }
}
