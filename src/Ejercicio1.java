import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código
        int cantidadventas;
        int total = 0;
        cantidadventas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas ventas fueron realizadas? :"));
        //proceso
        for(int i = 1; i <= cantidadventas; i++)  {
            int venta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la venta : " +i));
            total+=venta;

        }
        //salida
        JOptionPane.showMessageDialog(null, "el total de ventas del dia es de : $" +total);
    }
}




