import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        int peso;
        int aprobadas = 0;
        int defectuosas = 0;

        System.out.print("Cantidad de piezas: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Peso de la pieza " + i + ": ");
            peso = sc.nextInt();

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