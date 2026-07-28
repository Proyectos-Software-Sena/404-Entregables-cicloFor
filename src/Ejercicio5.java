import
public class Ejercicio5 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto ahorra cada mes?");
        int ahorro = sc.nextInt();

        System.out.println("Cuantos meses?");
        int meses = sc.nextInt();

        int total = 0;

        for(int i = 1; i <= meses; i++) {

            total = total + ahorro;

            System.out.println("Mes " + i + ": $" + total);
        }
    }
}
