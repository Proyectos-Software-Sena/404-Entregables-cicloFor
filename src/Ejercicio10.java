import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        int fibo = 0;
        int nashi = 1;
        int total = 0;

        for(int i=1; i<=number; i++){
            System.out.print(total);
            System.out.print(", ");
            nashi+=fibo;
            fibo= nashi-fibo;
            total = nashi;

        }
        sc.close();
    }
}
