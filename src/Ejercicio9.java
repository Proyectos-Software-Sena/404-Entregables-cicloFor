import javax.swing.JOptionPane;
public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código
        int bacterias;
        int horas;
        String resultado = "";
        bacterias = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad inicial de bacterias:"));
        horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas:"));
        //proceso
        for(int i = 1; i <= horas; i++) {
            bacterias = bacterias * 2;
            resultado = resultado + "Hora" + i + ":" + bacterias + "bacterias\n";
        }
        //salida
        JOptionPane.showMessageDialog(null,resultado);
    }
}
