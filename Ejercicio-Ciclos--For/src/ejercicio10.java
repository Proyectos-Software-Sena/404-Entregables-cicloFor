import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Cantidad de términos: ");
        n = sc.nextInt();

        int a = 0;
        int b = 1;
        int siguiente;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}