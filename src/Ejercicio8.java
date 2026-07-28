import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        String palabra;
        String invertidas = "";

        palabra = JOptionPane.showInputDialog("Ingrese la palabra");

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertidas += palabra.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Cadena invertida " +invertidas);
    }
}

