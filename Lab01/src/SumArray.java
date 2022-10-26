import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt(), sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + (i+1) + "]: ");
            int x = sc.nextInt();
            sum += x;
            a.add(x);
        }
        System.out.println("\nMảng a = " + a.toString());
        Collections.sort(a);
        System.out.println("\nSort a = " + a.toString());
        System.out.println("\nTrung bình = " + ((double)sum/n));
    }
}
