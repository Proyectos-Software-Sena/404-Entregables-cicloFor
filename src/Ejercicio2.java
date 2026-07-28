import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas piezas desea revisar?: ");
        int piezas = sc.nextInt();
        int defectuoso = 0;
        int aprobado = 0;

        for(int i=1; i<=piezas; i++){
            System.out.print("Ingrese el valor en gramos de la pieza numero "+i+": ");
            double peso = sc.nextDouble();

            if(peso<100 || peso>120){
                defectuoso++;
            }else{
                aprobado++;
            }
        }
        System.out.println("Aprobadas: "+aprobado+". Defectuosas: "+defectuoso);
        sc.close();
    }
}
