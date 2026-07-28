import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 1;
        int siguiente;
        String serie = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos"));

        for (int i = 1; i <= n; i++) {

            serie += a + " ";

            siguiente = a + b;
            a = b;
            b = siguiente;

        }

        JOptionPane.showMessageDialog(null,
                "Serie de Fibonacci:\n" + serie);

    }

}