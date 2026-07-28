import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args){
        // Generador de Códigos (Inversor de Cadenas)
        String palabra ;
        String invertido = "";
        palabra = JOptionPane.showInputDialog("ingrese  su palabra clave ");
        for (int i = palabra.length()-1; i >= 0; i--){
            invertido = invertido + palabra.charAt(i);
        }
        //fin
        JOptionPane.showMessageDialog(null,"clave invertida:"+invertido);
    }
}

