import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad inicial de bacterias: ");
        int bacterias = sc.nextInt();

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = sc.nextInt();
        for(int i=1; i<=horas; i++){
            int total = bacterias*i;
            System.out.println("Hora "+i+": "+total+" bacterias.");

        }
        sc.close();
    }
}
