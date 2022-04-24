import java.util.*;
import java.lang.Math;
public class CountingSort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j;
        System.out.print("Panjang Array : ");
        n = input.nextInt();
        ArrayList<Integer> data = new ArrayList();
        
        for (i = 0; i <= n - 1; i++) {
            System.out.print("elemen ke "+i+" : ");
            data.add(input.nextInt());
        }
        
        // Cetak Array Data
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(" " + data.get(i));
        }
        System.out.println(" ]");
        
        // Memulai Insertion Sort
        i = 1;
        while (i < n) {
            int temp;
            
            temp = data.get(i);
            boolean next;
            
            next = true;
            j = i;
            while (next == true) {
                if (temp < data.get(j-1)) {
                    data.set(j, data.get(j-1));
                    j = j - 1;
                    if (j <= 0) {
                        next = false;
                    }
                } else {
                    next = false;
                }
            }
            data.set(j, temp);
            i = i + 1;
        }
        
        // Cetak Hasil Sorting
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(" " + data.get(i));
        }
        System.out.println(" ]");
    }
}