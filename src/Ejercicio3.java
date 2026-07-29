public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de lecturas: ");
        int lecturas = sc.nextInt();

        double maxima = -999;

        for(int i = 1; i <= lecturas; i++){

            System.out.print("Temperatura " + i + ": ");
            double temperatura = sc.nextDouble();

            if(temperatura > maxima){
                maxima = temperatura;
            }
        }

        System.out.println("La temperatura máxima registrada fue: "
                + maxima + "°C");

        sc.close();
    }
}
