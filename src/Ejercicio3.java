import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[] args){
        int lecturadelatemperatura;
        double temperatura;
        double maximatemperatura = 0;

        lecturadelatemperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la temperatura"));

        for(int i = 1; i <= lecturadelatemperatura; i++){

            temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingresa la temperatura"));

            if (i==1){
                maximatemperatura = temperatura;
            }else if (temperatura > maximatemperatura){
                maximatemperatura=temperatura;
            }
        }
        JOptionPane.showMessageDialog(null, "la temperatura maxima ingresada es" +maximatemperatura +"°C");
    }
}
