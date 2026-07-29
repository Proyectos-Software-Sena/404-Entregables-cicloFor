import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int npiezas= Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas se van a revisar: "));
        int aprobadas= 0;
        int defectuosas= 0;

        for (int i= 1; i <= npiezas; i++){

            int peso= Integer.parseInt(JOptionPane.showInputDialog("Ingresar peso de la pieza " + i));

            if (peso < 100 || peso > 120){

                defectuosas++;

            }else {

                aprobadas++;
            }

        }

        JOptionPane.showMessageDialog(null,"piezas aprobadas: " + aprobadas + " piezas defectuosas: " + defectuosas);


    }
}
