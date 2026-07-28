import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){
        int numerodepiezasparatwingo = 0;
        int defectosdelapieza =0;
        int piezasbuenas= 0;
        double pesodelapieza =0;

        numerodepiezasparatwingo= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de la piez twingo para revisar"));

        for(int i = 1; i <= numerodepiezasparatwingo; i++){
            pesodelapieza = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la pieza"+i));

            if (pesodelapieza >= 100 && pesodelapieza <=120){
                piezasbuenas++;
            } else{
                defectosdelapieza++;
            }
        }

        JOptionPane.showMessageDialog(null, "piezas aprobadas por buen estado" +piezasbuenas + "\n"+"piezas en mal estado" +defectosdelapieza);
    }
}
