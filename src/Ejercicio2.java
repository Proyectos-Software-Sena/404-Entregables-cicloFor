import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadPiezas = 0;
        int aprobadas = 0;
        int defectuosas = 0;
        double peso;

        System.out.print("¿Cuántas piezas va a revisar? ");
        cantidadPiezas = sc.nextInt();

        for (int i = 1; i <= cantidadPiezas; i++) {
            System.out.print("Ingrese el peso de la pieza " + i + ": ");
            peso = sc.nextDouble();

            if (peso >= 100 && peso <= 120) {
                aprobadas++;
            } else {
                defectuosas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas + ". Piezas defectuosas: " + defectuosas);
    }
}