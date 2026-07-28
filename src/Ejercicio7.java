import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la taza de cambio del dia: ");
        double cambio = sc.nextDouble();
        for(int i=1; i<=10; i++){
            double total = i*cambio;
            System.out.println(i+" USD = $"+total);
        }
        sc.close();
    }
}
