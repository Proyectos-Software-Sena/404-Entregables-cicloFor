import javax.swing.*;


public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código

      int Clecturas;
      int Vtemperaturas;
      int Tmayor = Integer.MIN_VALUE;

      Clecturas=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de temperatura que se tomaron"));

      for (int i = 0; i < Clecturas; i++)  {

          Vtemperaturas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de cada temperatura:"));

          if (Vtemperaturas>Tmayor) {

               Tmayor = Vtemperaturas;

          }
      }

      JOptionPane.showMessageDialog(null,
              "La temperatura más alta registrada fue:"+Tmayor+"°C");










    }
}
