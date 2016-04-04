/**
 * Created by Manu on 04-Apr-16.
 */
public class p2 {
    public static void main(String[] args) {
        /*Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
        int n = 20; //sau o alta valoare */

        int n=23;
        int suma=0;
        for(int i=1; i<=n;i++){
            suma+=i;
        }
        System.out.println(suma);

    }
}
