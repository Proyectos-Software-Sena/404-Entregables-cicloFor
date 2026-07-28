import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args){
//Tabla de Conversión de Divisas
        double  tasa ;
        double  conversion;
        String tabla = "";
        tasa = Double.parseDouble(JOptionPane.showInputDialog("ingrese  la tasa  de cambio de cop a dolar")
        );
        for (int dolar = 1; dolar <= 10; dolar++){
            conversion = dolar * tasa;
            tabla = tabla + dolar +"usd =" +conversion + "cop\n";
        }
        //fin
        JOptionPane.showMessageDialog(null,tabla);


    }
}

