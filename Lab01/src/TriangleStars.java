// 6.3
import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 2*n;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < N; j++) {
                if(j >= N/2-i && j <= N/2+i) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
