import java.util.Scanner;

public class
Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        double venta, total = 0;

        System.out.print("¿Cuántas ventas se realizaron? ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            venta = sc.nextDouble();
            total += venta;
        }

        System.out.println("El total de ventas del día es: $" + total);
    }


}
