import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite el monto que ahorrará cada mes:");
        int ahorro = sc.nextInt();

        System.out.println("Digite la cantidad de meses:");
        int meses = sc.nextInt();

        int acumulado = 0;

        for (int i = 1; i <= meses; i++) {

            acumulado += ahorro;

            System.out.println("Mes " + i + ": $" + acumulado);

        }


    }
}