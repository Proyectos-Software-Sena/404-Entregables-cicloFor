import javax.swing.*;

public class ejercio10 {
    public static void main(String[] args){
        int n;
        int anterior = 0;
        int actual = 1;
        int siguiente;
        String serie = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos:"));

        for (int i = 1; i <= n; i++) {

            serie = serie + anterior + " \n ";

            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;

        }

        JOptionPane.showMessageDialog(null,"serie:\n " + serie);
    }
}

