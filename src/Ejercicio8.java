import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.print("Ingrese una palabra o cadena: ");
        texto = sc.nextLine();

        System.out.print("Cadena invertida: ");

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
}