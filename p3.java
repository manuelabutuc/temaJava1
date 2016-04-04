import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manu on 04-Apr-16.
 */
public class p3 {
    public static void main(String[] args) {
        /*Se citesc numere naturale pânã când se introduce numãrul 0.
        Afisati suma obtinutã prin adunarea primei si a ultimei cifre din fiecare numar citit.
        Numerele cu mai putin de 2 cifre nu se iau in considerare. */


        int suma = 0;
        int x;
        do {
            System.out.print("Introduceti un numar:");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            if (x != 0) {
                int last = x % 10;
                int first;
                while (x > 9) {
                    x /= 10;
                }
                first = x;
                suma = first + last;
                System.out.println("Suma primei si a ultimei cifre este: " + suma);
                System.out.println();
            }
        } while (x != 0);


    }
}

