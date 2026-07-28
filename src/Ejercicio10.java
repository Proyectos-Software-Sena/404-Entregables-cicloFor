import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de términos"));

        int a = 0;
        int b = 1;

        String serie = "";

        for (int i = 1; i <= n; i++) {

            serie += a + " ";

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        JOptionPane.showMessageDialog(null, serie);
    }
}
