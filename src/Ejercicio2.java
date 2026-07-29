public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int piezas, aprobadas = 0, defectuosas = 0;
        double peso;

        System.out.print("Cantidad de piezas a revisar: ");
        piezas = sc.nextInt();

        for (int i = 1; i <= piezas; i++) {
            System.out.print("Peso de la pieza " + i + ": ");
            peso = sc.nextDouble();

            if (peso < 100 || peso > 120) {
                defectuosas++;
            } else {
                aprobadas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas);
        System.out.println("Piezas defectuosas: " + defectuosas);
    }
}
