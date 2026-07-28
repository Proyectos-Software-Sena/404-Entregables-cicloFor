import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones tiene el módulo? ");
        int n = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = sc.nextDouble();
            suma += nota;
        }

        double promedio = suma / n;
        String estado = promedio >= 3.0 ? "Aprobado" : "No Aprobado";
        System.out.println("Promedio: " + promedio + " - Estado: " + estado);
    }
}
