public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        double trm;

        System.out.print("Ingrese la TRM del día: ");
        trm = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " USD = " + (i * trm) + " COP");
        }
    }
}
