import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite una palabra:");
        String palabra = sc.nextLine();

        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {

            invertida += palabra.charAt(i);

        }

        System.out.println("Su token es: " + invertida);

        sc.close();
    }
}