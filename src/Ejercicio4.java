import java.util.Scanner;

public class Ejercicio4 {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuantas notas maneja el modulo: ");
        int total = sc.nextInt();
        double suma = 0;

        for(int i=1; i<=total; i++){
            System.out.print("Ingrese la nota numero "+i+": ");
            double nota = sc.nextDouble();
            if(nota<=5.0 && nota>=0.0) {
                suma += nota;
            }else{
                System.out.println("La nota ingresada no esta dentro del rango 0.0 y 5.0, intentelo nuevamente");
                i--;
            }
        }
        double prom = suma/total;

        if(prom>=3.0){
            System.out.print("El promedio es "+prom+".Estado: Aprobado");
        }else{
            System.out.print("El promedio es "+prom+". Estado: Reprobado");
        }
        sc.close();
    }
}
