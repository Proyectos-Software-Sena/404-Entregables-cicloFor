import javax.swing.JOptionPane;

public class Ejercicio8{

    public static void main(String[] args) {

        String texto;
        String invertido = "";

        texto = JOptionPane.showInputDialog("Ingrese una palabra o frase");

        for (int i = texto.length() - 1; i >= 0; i--) {

            invertido = invertido + texto.charAt(i);

        }

        JOptionPane.showMessageDialog(null, "Texto invertido:\n" + invertido);

    }

}