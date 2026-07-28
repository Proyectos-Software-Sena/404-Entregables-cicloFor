import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ahorroMensual;
        int meses;
        int acumulado = 0;

        System.out.print("Ahorro mensual: ");
        ahorroMensual = sc.nextInt();

        System.out.print("Cantidad de meses: ");
        meses = sc.nextInt();

        for (int i = 1; i <= meses; i++) {

            acumulado += ahorroMensual;

            System.out.println("Mes " + i + ": $" + acumulado);
        }
    }
}