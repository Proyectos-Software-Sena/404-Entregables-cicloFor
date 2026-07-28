import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {

        String palabra;
        String invertida = "";

        palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        for (int i = palabra.length() - 1; i >= 0; i--) {

            invertida += palabra.charAt(i);

        }

        JOptionPane.showMessageDialog(null,
                "Cadena invertida: " + invertida);

    }

}