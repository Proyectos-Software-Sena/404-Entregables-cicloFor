import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de términos:");
        int cantidad = sc.nextInt();

        int primero = 0;
        int segundo = 1;

        for (int i = 1; i <= cantidad; i++) {

            System.out.print(primero+"," + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        sc.close();
    }
}
