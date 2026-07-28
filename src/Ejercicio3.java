import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas lecturas de temperatura se tomaron? ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Lectura " + i + " (°C): ");
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + max + "°C");
    }
}

