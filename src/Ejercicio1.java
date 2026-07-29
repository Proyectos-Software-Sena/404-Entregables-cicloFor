public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ventas realizadas: ");
        int ventas = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= ventas; i++) {
            System.out.print("Ingrese el valor de la venta " + i + ": ");
            int valor = sc.nextInt();

            total += valor;
        }

        System.out.println("El total de ventas del día es: $" + total);

        sc.close();
    }
}
