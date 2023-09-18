import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en soles: ");
        
        double soles = leer.nextDouble();
        double tipoCambio = 0.25;
        
        double euros = soles * tipoCambio;
        
        System.out.println(soles + " soles son equivalentes a " + euros + " euros.");
        
    }
}
