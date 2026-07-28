import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int a = 0, b = 1, siguiente;

        System.out.print("Ingrese la cantidad de términos: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}