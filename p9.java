/**
 * Created by Manu on 04-Apr-16.
 */
public class p9 {
    public static void main(String[] args) {
        /* Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este
        sa se ordoneze si sa se afiseze in ordine crescatoare */
        int[] list = {6, 5, 23, 1, 13, 2, 7};
        //int[] list = {1,3,6,8,9,89};
        int[] listcopy = list.clone();


        int i;
        int j;
        boolean test=false;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < list.length - 1; i++) {
                for (j = 0; j < list.length - 1; j++) {
                    if (list[i] > list[i + 1]) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        }

        for (i = 0; i < list.length; i++) {
            if (list[i] == listcopy[i]) {
                test = true;
            } else {
                for (i = 0; i < list.length; i++) {
                    System.out.print(list[i]+", ");

                }
            }
        }
        if(test==true){
            System.out.println("Crescator"); //daca il punem mai sus, in "for", se afiseaza la fiecare iteratie
        };
    }
}
