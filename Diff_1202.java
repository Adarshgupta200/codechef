import java.util.*;
class Diff_1202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 0;
        for(int i=0; i<n; i++){
            int ad = sc.nextInt();
            if(ad == 1){
                a1++;
            } else {
                a2++;
            }
        }
        System.out.println(Math.min(a1, a2));
    }
}
