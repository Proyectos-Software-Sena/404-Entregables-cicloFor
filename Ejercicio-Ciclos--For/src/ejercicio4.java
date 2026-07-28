import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        double nota;
        double suma = 0;

        System.out.print("Cantidad de calificaciones: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Nota " + i + ": ");
            nota = sc.nextDouble();

            suma += nota;
        }

        double promedio = suma / cantidad;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: No Aprobado");
        }
    }
}