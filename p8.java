import java.util.Scanner;

/**
 * Created by Manu on 04-Apr-16.
 */
public class p8 {
    public static void main(String[] args) {
        
        /*Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n */

        System.out.print("x = ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.print("n = ");
        Scanner in1 = new Scanner(System.in);
        int n = in1.nextInt();

        long sum = 1L;
        long pow = 1L;

        for (int i = 0; i < n; i++) {
            pow = pow * x;
            sum += pow;
        }

        System.out.println(sum);
    }
}
