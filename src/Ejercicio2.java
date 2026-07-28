public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int piezas;
        int aprobadas = 0;
        int defectuosas = 0;

        System.out.println("Cuantas piezas va a revisar?: ");
        piezas = sc.nextInt();

        for(int i = 1; i <= piezas; i++) {

            System.out.println("Peso de la pieza: " + i);
            double peso = sc.nextDouble();

            if(peso < 100 || peso > 120) {
                defectuosas++;
            } else {
                aprobadas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas);
        System.out.println("Piezas defectuosas: " + defectuosas);

    }
}
