/**
 * Created by Manu on 04-Apr-16.
 */
public class p7 {
    public static void main(String[] args) {
        //Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
        int[] list = {2, 3, 5, 5, 6, 1, 34, 12, 43, 7, 22, 9};
        int i;
        System.out.println("Perechile de numere sunt:");
        for (i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                System.out.print("(" + list[i] + "," + list[i + 1] + ")" + "  ");
            } else if (list[i] < list[i + 1]) {
                System.out.print("(" + list[i + 1] + "," + list[i] + ")" + "  ");
            }
        }
    }
}