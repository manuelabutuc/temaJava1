/**
 * Created by Manu on 04-Apr-16.
 */
public class p7 {
    public static void main(String[] args) {
        //Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
        int[] list = {2, 3, 5, 6, 1};
        int i;
        int j;
        System.out.println("Perechile de numere sunt:");
        for (i = 0; i < list.length; i++) {
            //System.out.println(list[i]);
            for (j = 0; j < list.length; j++) {
                if (list[i] > list[j]) {
                    System.out.print("(" + list[i] + "," + list[j] + ")" + "  ");
                }
            }
        }
    }
}
