import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        int edad;
        int menores = 0;
        int adultos = 0;

        System.out.print("Ingrese la cantidad de asistentes: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la edad del asistente " + i + ": ");
            edad = sc.nextInt();

            if (edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("Menores: " + menores + " - Adultos: " + adultos);
    }
}