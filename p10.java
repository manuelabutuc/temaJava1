/**
 * Created by Manu on 04-Apr-16.
 */
public class p10 {
    public static void main(String[] args) {
        /* Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,
        iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si numerele
        asa cum sunt in sir daca sunt pare.  */

        int[] list = {6, 5, 23, 1, 13, 2, 7, 4, 6};
        for(int i=0; i<list.length/2; i++){
            System.out.print(list[i]*2+", ");
        }
        for(int i=list.length/2; i<list.length; i++){
            if(list[i]%2==1){
                System.out.print(list[i]*3+", ");
            }
            else {
                System.out.print(list[i]+", ");
            }
        }


    }
}
