import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código
        double tasa;
        double conversion;
        String tabla = "";
        tasa = Double.parseDouble(JOptionPane.showInputDialog("ingrese la tasa de cambio:"));
        //proceso
        for(int dolar = 1; dolar <= 10; dolar++) {
            conversion = dolar * tasa;
            tabla = tabla + dolar + "USD =" + conversion + "COP\n";

        }
        //salida
        JOptionPane.showMessageDialog(null,tabla);
    }
}
