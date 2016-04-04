import java.util.Scanner;

/**
 * Created by Manu on 04-Apr-16.
 */
public class learn1 {
    public static void main(String[] args) {

            //Temperature conversion
            System.out.println("Introduceti temperatura in grade Fahrenheit:");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            double tempC=0.5556*(temp-32);
            System.out.print("Temperatura este "+tempC+" grade Celsius");
        }
}
