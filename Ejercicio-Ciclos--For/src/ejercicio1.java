import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadVentas;
        int venta;
        int total = 0;

        System.out.print("¿Cuántas ventas se realizaron?: ");
        cantidadVentas = sc.nextInt();

        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Valor de la venta " + i + ": ");
            venta = sc.nextInt();
            total += venta;
        }

        System.out.println("El total de ventas del día es: $" + total);
    }
}