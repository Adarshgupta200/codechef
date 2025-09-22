import java.util.*;
class Diff_1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        while(t-->0){
            int x = sc.nextInt();
            int arr[] = new int[x];
            for(int i=0; i<x; i++){
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> ad = new HashSet<>();
            for(int i=0; i<x-1; i++){
                if(arr[i] != arr[i+1]){
                    ad.add(i);
                    ad.add(i+1);
                }
            }
            System.out.println(ad.size());
        }
    }
}
