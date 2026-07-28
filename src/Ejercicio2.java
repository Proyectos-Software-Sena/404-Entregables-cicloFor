import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas piezas se van a revisar? ");
        int n = sc.nextInt();
        int aprobadas = 0, defectuosas = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Peso de la pieza " + i + " (g): ");
            int peso = sc.nextInt();
            if (peso >= 100 && peso <= 120) {
                aprobadas++;
            } else {
                defectuosas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas);
        System.out.println("Piezas defectuosas: " + defectuosas);
    }
}

