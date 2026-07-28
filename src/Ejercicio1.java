import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){
        int numerodeventas= 0;
        double ventas= 0;
        double totaldeventas = 0;

        numerodeventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas hechas el dia de hoy en superinter"));

        for(int i = 1; i <= numerodeventas; i++){

            ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las venta realizadas:" +i));
            totaldeventas += ventas;
        }
        JOptionPane.showMessageDialog(null, "El valor de las ganancias fueron de" + totaldeventas);
    }
}