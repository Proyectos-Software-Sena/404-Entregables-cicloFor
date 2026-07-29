import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de calificaciones: ");
        int cantidad = sc.nextInt();

        double suma = 0;

        for(int i = 1; i <= cantidad; i++){

            System.out.print("Ingrese nota " + i + ": ");
            double nota = sc.nextDouble();

            suma += nota;
        }

        double promedio = suma / cantidad;

        System.out.printf("Promedio: %.2f%n", promedio);

        if(promedio >= 3.0){
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: No Aprobado");
        }

        sc.close();
    }
}
