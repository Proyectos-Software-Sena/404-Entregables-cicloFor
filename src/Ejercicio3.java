import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int lecturas= Integer.parseInt(JOptionPane.showInputDialog("ingresar cantidad de temperaturas a registrar "));
        int total=0;

        for (int i= 1; i <= lecturas; i++){

            int temperaturas= Integer.parseInt(JOptionPane.showInputDialog("ingresar temperatura " + i));

            if (i == 1){

                total = temperaturas;

            }else {

                if (temperaturas > total){

                    total = temperaturas;
                }
            }

        }
        JOptionPane.showMessageDialog(null, "La temperatura máxima registrada fue: " + total + "°C");

    }
}
