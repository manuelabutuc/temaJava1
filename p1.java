import java.util.Scanner;
/**
 * Created by Manu on 04-Apr-16.
 */
public class p1 {

    public static void main(String[] args) {

         /*  1.Se da un sir de numere ordonate crescator.
        Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1. */

        int[] sir = {1, 3, 5, 6, 7, 8, 11, 13, 14, 26, 100};

        System.out.print("Introduceti numarul cautat:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i = 0;
        boolean test = true;

        while (test && i<sir.length) {
            if (sir[i] == n) {

                System.out.println("Numarul a fost gasit la pozitia: " + i + " a sirului!");
                test = false;
            }
            i++;
        }
        if (test) {
            System.out.println("-1");

        }
    }
}
