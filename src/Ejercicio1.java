import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int cantidad;
        int venta;
        int total = 0;

        System.out.println("Cuantas ventas se realizaron?");
        cantidad = sc.nextInt();

        for(int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese la venta: " + i);
            venta = sc.nextInt();

            total = total + venta;
        }

        System.out.println("Total de ventas: $" + total);
    }
}
