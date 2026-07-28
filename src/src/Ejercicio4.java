import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Digite la cantidad de notas del módulo:");
        int cantidad_notas = sc.nextInt();

        double sumaNotas = 0;

        for (int i = 1; i <= cantidad_notas; i++) {

            System.out.println("Digite la nota " + i + ":");
            double nota = sc.nextDouble();

            sumaNotas += nota;
        }

        double promedio = sumaNotas / cantidad_notas;

        System.out.println("Su promedio es: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }

    }
}
