public class Ejercicio6 {
    public static void main(String[] args) {
        //Ingrese su código
        Scanner sc = new Scanner(System.in);

        int menores = 0;
        int adultos = 0;

        System.out.println("Cantidad de asistentes:");
        int cantidad = sc.nextInt();

        for(int i = 1; i <= cantidad; i++) {

            System.out.println("Edad del asistente: " + i);
            int edad = sc.nextInt();

            if(edad < 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("Menores: " + menores);
        System.out.println("Adultos: " + adultos);
    }
}
