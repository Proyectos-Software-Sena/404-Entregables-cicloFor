public class Ejercicio1 {
    public static void main(String[] args) {
            Scanner tc = new Scanner(System.in);
            System.out.println("Hola, bienvenido");
            System.out.println("--------------------");
            System.out.println("Ingresa la cantidad de ventas realizadas en el dia de hoy");
            int ventas = tc.nextInt();
            double ingresos = 0;

            for (int i = 0; i<ventas;i++){
                System.out.println("Ingresa el valor de la venta "+(i+1));
                double valor = tc.nextDouble();
                ingresos+=valor;
            }
            System.out.println("El total de ventas en el día es de "+ingresos);
    }
}
