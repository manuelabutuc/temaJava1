/**
 * Created by Manu on 04-Apr-16.
 */
public class learn3 {

    public static void main(String[] arguments) {
        int[] lista = {0, 10, 15, 20, 30, 35};
        System.out.println("Temperatura(Celsius)"+ " |  "+ "Temperatura(Fahrenheit)");
        for (int i = 0; i < lista.length; i++) {
            double tempF = 1.8 * lista[i] + 32;
            if (i == 0) {
                System.out.println("          " + lista[i] + "          |          " + tempF);
            } else {
                System.out.println("         " + lista[i] + "          |          " + tempF);
            }
        }

    }
}