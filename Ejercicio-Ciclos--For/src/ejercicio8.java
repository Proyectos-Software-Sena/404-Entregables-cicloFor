import javax.swing.JOptionPane;

public class ejercicio8 {

    public static void main(String[] args) {

        // Pedir la palabra o cadena de texto
        String cadena = JOptionPane.showInputDialog(
                "Ingrese una palabra clave o cadena de texto:"
        );

        // Variable para almacenar la cadena invertida
        String cadenaInvertida = "";

        // Recorrer la cadena desde el último carácter hasta el primero
        for (int i = cadena.length() - 1; i >= 0; i--) {

            cadenaInvertida += cadena.charAt(i);
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(
                null,
                "Cadena original: " + cadena
                        + "\nCadena invertida: " + cadenaInvertida
        );
    }
}