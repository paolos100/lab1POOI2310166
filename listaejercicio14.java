import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el día de la semana (lunes a viernes): ");
        String diaSemana = leer.nextLine();
        
        System.out.print("Ingrese la hora (formato 24 horas): ");
        int hora = leer.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = leer.nextInt();
        
        int minutosHastaFinDeSemana = calcularMinutosHastaFinDeSemana(diaSemana, hora, minutos);
        
        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana);
        
    }
    
    public static int calcularMinutosHastaFinDeSemana(String diaSemana, int hora, int minutos) {
        int minutosPorDia = 24 * 60; 
        
        int horaFinDeSemana = 15;
        int minutosFinDeSemana = 0;
        
        int minutosHastaFinDeSemana = 0;
        
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                minutosHastaFinDeSemana = (4 * minutosPorDia) + (horaFinDeSemana * 60 + minutosFinDeSemana) - (hora * 60 + minutos);
                break;
            case "martes":
                minutosHastaFinDeSemana = (3 * minutosPorDia) + (horaFinDeSemana * 60 + minutosFinDeSemana) - (hora * 60 + minutos);
                break;
            case "miércoles":
                minutosHastaFinDeSemana = (2 * minutosPorDia) + (horaFinDeSemana * 60 + minutosFinDeSemana) - (hora * 60 + minutos);
                break;
            case "jueves":
                minutosHastaFinDeSemana = (1 * minutosPorDia) + (horaFinDeSemana * 60 + minutosFinDeSemana) - (hora * 60 + minutos);
                break;
            case "viernes":
                if (hora < horaFinDeSemana || (hora == horaFinDeSemana && minutos < minutosFinDeSemana)) {
                    minutosHastaFinDeSemana = (horaFinDeSemana * 60 + minutosFinDeSemana) - (hora * 60 + minutos);
                } else {
                    minutosHastaFinDeSemana = 0;
                }
                break;
        }
        
        return minutosHastaFinDeSemana;
    }
}
