import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código

        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de terminos:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
