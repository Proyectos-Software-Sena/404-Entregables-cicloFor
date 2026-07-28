import javax.swing.*;

public class Ejercicio4 {
    public  static void main(String args[]){
        //Ingrese su código

        int Cdelmodulo;
        double Notas;
        double promedio;
        double suma = 0;

        Cdelmodulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones "));

        for (int i = 0; i <= Cdelmodulo; i++) {

         Notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cada nota "+(i+1)));

         suma = suma + Notas;
        }

     promedio = suma / Cdelmodulo;
        if (promedio>= 3.33) {
            JOptionPane.showMessageDialog(null,
                    "Promedio:" + promedio + "Estado:" + "Aprobado");

        } else {
            JOptionPane.showMessageDialog(null,
                    "Promedio." + promedio + "Estado" + "No aprobado");
        }

    }
}




