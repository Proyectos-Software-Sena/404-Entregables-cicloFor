import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double trm;

        System.out.print("Ingrese la trm del día: ");
        trm = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " usd = " + (i * trm) + " COP");
        }
    }
}