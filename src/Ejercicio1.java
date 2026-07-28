import javax.swing.*;

public class Ejercicio1 {
    public  static void main(String[] args){
        //Cierre de Caja (Totalizar Ventas
        int ventas ;
        int valorventa;
        int total = 0;
        ventas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas ventas se realizaron en el dia? ")
        );
        for (int i  = 1; i <= ventas; i++){
            valorventa =  Integer.parseInt(JOptionPane.showInputDialog("el valor de cada una de las ventas:" + i)

            );
            total = total + valorventa;
        }
        JOptionPane.showMessageDialog(null,"El total de ventas del día es: " + total);
    }

}