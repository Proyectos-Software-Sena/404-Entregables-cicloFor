import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ahorroMensual = 0;
        double acumulado = 0;
        int meses;

        System.out.print("Ingrese el monto que ahorrará cada mes: ");
        ahorroMensual = sc.nextDouble();

        System.out.print("Ingrese la cantidad de meses: ");
        meses = sc.nextInt();

        for (int i = 1; i <= meses; i++) {
            acumulado += ahorroMensual;
            System.out.println("Mes " + i + ": $" + acumulado);
        }
    }
}