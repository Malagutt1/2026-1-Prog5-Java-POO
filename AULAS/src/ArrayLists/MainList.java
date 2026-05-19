package ArrayLists;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
    	//=== Primeiro código com Array em Java ===
        int[] idade = new int[10];
        Scanner tkl = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade #" + (i + 1) + ": ");
            idade[i] = tkl.nextInt();
        }
        tkl.close();
    }
}