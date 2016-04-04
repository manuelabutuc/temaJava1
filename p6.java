import java.util.Scanner;

/**
 * Created by Manu on 04-Apr-16.
 */
public class p6 {
    public static void main(String[] args) {
        //Sa se calculeze factorialul unui numar a
        System.out.print("Introduceti un numar a= ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int x=1;

        for(int i=1; i<=a; i++){
            x*=i;
        }

        System.out.println("a! este egal cu: " +x);
    }
}
