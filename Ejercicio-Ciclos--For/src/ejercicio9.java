import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bacterias;
        int horas;

        System.out.print("Cantidad inicial de bacterias: ");
        bacterias = sc.nextInt();

        System.out.print("Horas de proyección: ");
        horas = sc.nextInt();

        for (int i = 1; i <= horas; i++) {

            bacterias *= 2;

            System.out.println("Hora " + i + ": " + bacterias + " bacterias");
        }
    }
}