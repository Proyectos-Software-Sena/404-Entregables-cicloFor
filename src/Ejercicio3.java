import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidadlecturas = 0;
        double temperatura = 0;
        double temeraturamaxima = 0;

        cantidadlecturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lecturas"));

        for (int i = 1; i <= cantidadlecturas; i++) {

            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura "+i));

            if (i==1){
                temeraturamaxima = temperatura;
            }else if (temperatura > temeraturamaxima){
                temeraturamaxima = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "La temperatura maxima registrada es " + temeraturamaxima + "°c");
    }
}
