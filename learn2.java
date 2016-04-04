import java.util.Scanner;

/**
 * Created by Manu on 04-Apr-16.
 */
public class learn2 {
    public static void main(String[] args) {

        //Numere impare
        int[] lista = {4, 7, 9, 2, 5, 3, 254, 8543, 43, 545};
        System.out.print("Numerele impare din sir sunt: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 1) {
                System.out.print(lista[i]+ ", ");
            }
        }
    }
}

