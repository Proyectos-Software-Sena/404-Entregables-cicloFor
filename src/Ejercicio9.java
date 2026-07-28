import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad inicial de bacterias: ");
        int inicial = sc.nextInt();
        System.out.print("Cantidad de horas: ");
        int horas = sc.nextInt();

        int poblacion = inicial;
        for (int i = 1; i <= horas; i++) {
            poblacion *= 2;
            System.out.println("Hora " + i + ": " + poblacion + " bacterias");
        }
    }
}
