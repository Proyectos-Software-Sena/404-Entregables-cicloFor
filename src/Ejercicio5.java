import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Monto fijo mensual: ");
        int monto = sc.nextInt();
        System.out.print("Cantidad de meses: ");
        int meses = sc.nextInt();

        int acumulado = 0;
        for (int i = 1; i <= meses; i++) {
            acumulado += monto;
            System.out.println("Mes " + i + ": $" + acumulado);
        }
    }
}
