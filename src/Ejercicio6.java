import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuantos invitados asisten al evento: ");
        int asist = sc.nextInt();
        int mayor = 0;
        int menor = 0;

        for(int i=1; i<=asist; i++){
            System.out.print("Ingrese la edad del invitado numero "+i+": ");
            int age = sc.nextInt();
            if(age>=18){
                mayor++;
            }else{
                menor++;
            }
        }
        System.out.print("Mayores: "+mayor+", menores: "+menor);
        sc.close();
    }
}
