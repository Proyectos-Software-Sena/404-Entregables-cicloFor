import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la tasa de representativa del mercado actual:");
        int tmr= sc.nextInt();


        int acumulado = 0;

        for (int i = 1; i <= 10; i++) {

            acumulado= tmr* i;

            System.out.println(i+"USD"+"= $"+acumulado +"COP");

        }


    }
}
