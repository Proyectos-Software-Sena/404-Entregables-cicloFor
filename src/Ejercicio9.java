import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad inicial de bacterias:");
        int bacterias = sc.nextInt();

        System.out.println("Cantidad de horas:");
        int horas = sc.nextInt();

        for(int i = 1; i <= horas; i++) {

            bacterias = bacterias * 2;

            System.out.println("Hora " + i + ": " + bacterias + " bacterias");
        }
    }
}
