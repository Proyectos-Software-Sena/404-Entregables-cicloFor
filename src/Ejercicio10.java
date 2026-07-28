import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de términos N: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a);
        for (int i = 2; i <= n; i++) {
            System.out.print(", " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
