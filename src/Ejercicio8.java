import javax.swing.JOptionPane;
public class Ejercicio8 {
    public static void main (String[] args) {
        //Ingrese su código
        String palabra;
        String invertida = "";
        palabra = JOptionPane.showInputDialog("ingrese una palabra:");
        //proceso
        for(int i = palabra.length() - 1; i >= 0; i--){
            invertida = invertida + palabra.charAt(i);
        }
        //salida
        JOptionPane.showMessageDialog(null, "cadena invertida:" +invertida);
    }
}
