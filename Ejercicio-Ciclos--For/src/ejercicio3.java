import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        int temperatura;
        int maxima = Integer.MIN_VALUE;

        System.out.print("Cantidad de lecturas: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Temperatura " + i + ": ");
            temperatura = sc.nextInt();

            if (temperatura > maxima) {
                maxima = temperatura;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + maxima + "°C");
    }
}