import javax.swing.*;

public class Ejercicio9 {
    public  static void main(String[] args){
        int bacterias;
        int horas;
        String resuelto = "";
        bacterias = Integer.parseInt((JOptionPane.showInputDialog("ingrese la cantidad inicial de las bacterias "))
        );
        horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas ")
        );
        for (int i =1 ; i <= horas; i++ ){
            bacterias =  bacterias * 2;
            resuelto = resuelto + "horas " + i + " : " + bacterias + "bacterias\n " ;
        }
        JOptionPane.showMessageDialog(null,resuelto);
    }
}
