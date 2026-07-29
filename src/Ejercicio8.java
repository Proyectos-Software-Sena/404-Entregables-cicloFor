import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra o cadena de texto: ");
        String texto = entrada.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("\nLa cadena invertida es: " + textoInvertido);

        entrada.close();
    }
}
