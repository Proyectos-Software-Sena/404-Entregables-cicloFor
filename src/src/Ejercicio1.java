import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de ventas del día:");
        int cantidad_ventas = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= cantidad_ventas; i++) {

            System.out.println("Digite el valor de la venta " + i + ":");
            int precio_venta = sc.nextInt();

            total += precio_venta;
        }

        System.out.println("El total de las ventas del día fue: " + total);

    }
}

