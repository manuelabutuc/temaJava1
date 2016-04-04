import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Manu on 04-Apr-16.
 */
public class p11 {
    public static void main(String[] args) {
        /*Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze. */
        int[] list = {6, 5, 23, 1, 13, 2, 7, 4, 6};
        int[] list2 = new int[list.length];
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int a = 3;
        int b = 15;
        for (int i = 0; i < list.length; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] >= a && list[i] <= b) {
                    list2[i] = list[i];
                }
            }
        }
        for (int i=0; i<list2.length;i++){
            if(list2[i]>0) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(list2[i]);
            }
        }

//        System.out.println(list1.toString());

    }
}

