
public class Ejercicio3 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas temperaturas va a ingresar?");
        int cantidad = sc.nextInt();

        double mayor = 0;

        for(int i = 1; i <= cantidad; i++) {

            System.out.println("Temperatura " + i);
            double temp = sc.nextDouble();

            if(i == 1 || temp > mayor) {
                mayor = temp;
            }
        }

        System.out.println("La temperatura más alta fue: " + mayor);
    }
}
