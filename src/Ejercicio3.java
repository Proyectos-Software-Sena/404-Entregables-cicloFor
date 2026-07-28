import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        double temperatura, mayor = 0;

        System.out.print("¿Cuántas lecturas desea ingresar? ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la temperatura " + i + ": ");
            temperatura = sc.nextDouble();

            if (i == 1 || temperatura > mayor) {
                mayor = temperatura;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + mayor + "°C");
    }
}