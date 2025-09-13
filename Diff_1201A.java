import java.util.*;

class Diff_1201A {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int D = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int answer = -1;
            for (int i = 0; i <= 100; i++) {
                if (Y - i < 0) continue;
                
                int remaining = Y - i;
                int discountPercent = i * D;
                int rhs = X * (100 - discountPercent);
                
                if (100 * remaining >= rhs) {
                    answer = i;
                    break;
                }
            }
            System.out.println(answer);
        }
        
        sc.close();
    }
}
