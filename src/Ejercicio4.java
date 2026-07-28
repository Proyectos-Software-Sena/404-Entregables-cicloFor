import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de notas:");
        int cantidad = sc.nextInt();

        double suma = 0;

        for(int i = 1; i <= cantidad; i++) {

            System.out.println("Ingrese la nota: " + i);
            double nota = sc.nextDouble();

            suma = suma + nota;
        }

        double promedio = suma / cantidad;

        System.out.println("Promedio: " + promedio);

        if(promedio >= 3.0) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("No aprobado.");
        }
    }
}
