import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la TRM:");
        int trm = sc.nextInt();

        for(int i = 1; i <= 10; i++) {

            System.out.println(i + " USD = " + (i * trm) + " COP");
        }
    }
}
