import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código

        int Cpiezas;
        int peso;
        int defectousas = 0;
        int aprobadas = 0;

        Cpiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de piezas a revisar:"));

        for (int i = 1; i <= Cpiezas; i++) {

            peso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de cada pieza (gramos) :"));


            if(peso<100 || peso>120) {

                defectousas++;

            }else{
                aprobadas++;


            }
        }
        JOptionPane.showMessageDialog(null,
                "La cantidad de piezas aprobadas es :"+aprobadas);

    }
}




