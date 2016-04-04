import java.util.Scanner;

/**
 * Created by Manu on 04-Apr-16.
 */
public class p5 {
    public static void main(String[] args) {
        //Se dau doua numere a si n. sa se afiseze numarul a la puterea n

        System.out.print("Introduceti primul numar a=");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("Introduceti cel de-al doilea numar b=");
        Scanner in1 = new Scanner(System.in);
        int b = in1.nextInt();

        System.out.println("a la puterea b este " + Math.pow(a,b));
    }
}
