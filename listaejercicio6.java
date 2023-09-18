import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en megabytes (MB): ");
        
        int megabytes = leer.nextInt();
        int kilobytes = megabytes * 1000;
        
        System.out.println(megabytes + " MB equivalen a " + kilobytes + " KB.");

    }
}
