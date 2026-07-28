import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int cantidad = 0;
        int num1 = 0;
        int num2 = 1;
        int siguiente;
        String resultado = "";

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos"));

        for (int i = 1; i <= cantidad; i++) {

            resultado += num1 + " ";

            siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        JOptionPane.showMessageDialog(null, "Serie de fibonacci " +resultado);
    }
}