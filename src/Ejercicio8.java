import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        String texto;
        String invertido = "";

        System.out.print("Ingrese una palabra o cadena: ");
        texto = sc.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Cadena invertida: " + invertido);
    }
}
