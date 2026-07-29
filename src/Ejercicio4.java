ximport java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        //Ingrese su código

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidad = entrada.nextInt();

        double nota;
        double sumaNotas = 0;
        double promedio;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la nota #" + i + " (0.0 - 5.0): ");
            nota = entrada.nextDouble();

            sumaNotas += nota;
        }

        promedio = sumaNotas / cantidad;

        System.out.printf("\nPromedio: %.2f", promedio);

        if (promedio >= 3.0) {
            System.out.println(" - Estado: Aprobado");
        } else {
            System.out.println(" - Estado: No Aprobado");
        }

        entrada.close();
    }

}
