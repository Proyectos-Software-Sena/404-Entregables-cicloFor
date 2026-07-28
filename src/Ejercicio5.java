import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos meses sera su plan de ahorro?: ");
        int plan = sc.nextInt();
        System.out.print("Cuanto desea ahorrar?: ");
        double ahorro = sc.nextDouble();

        for(int i=1; i<=plan; i++){
            double total = i*ahorro;
            System.out.println("Mes "+i+": $"+total);
        }
        sc.close();
    }
}
