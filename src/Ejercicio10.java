import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código
        int n;
        int anterior = 0;
        int actual = 1;
        int siguiente;
        String serie = "";
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de terminos:"));
        //proceso
        for(int i = 1; i <= n; i++) {
            serie = serie + anterior + ",";
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
        //salida
        JOptionPane.showMessageDialog(null,serie);
    }
}
