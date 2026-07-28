import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuantas ventas hizo el dia de hoy: ");
        int ventas = sc.nextInt();
        double total = 0;

        for(int i=1;i<=ventas;i++){
            System.out.print("Ingrese el valor del producto numero "+i+": ");
            double produ = sc.nextDouble();
            total+=produ;

        }
        System.out.println("El total de ventas del dia es: "+total);
        sc.close();
    }
}
