import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        double nota = 0;
        double suma = 0;
        double promedio;

        System.out.print("¿Cuántas calificaciones va a ingresar? ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = sc.nextDouble();
            suma += nota;
        }

        promedio = suma / cantidad;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: No Aprobado");
        }
    }
}