import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        String palabra;
        String palabraInvertida = "";

        // Solicitar la palabra
        palabra = JOptionPane.showInputDialog("Ingrese una palabra o cadena de texto:");

        // Invertir la palabra
        for (int i = palabra.length() - 1; i >= 0; i--) {

            palabraInvertida = palabraInvertida + palabra.charAt(i);

        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null,
                "Cadena invertida: " + palabraInvertida);
    }
}