public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int bacterias;
        int horas;

        System.out.print("Cantidad inicial de bacterias: ");
        bacterias = sc.nextInt();

        System.out.print("Cantidad de horas: ");
        horas = sc.nextInt();

        for (int i = 1; i <= horas; i++) {
            bacterias *= 2;
            System.out.println("Hora " + i + ": " + bacterias + " bacterias");
    }
}
