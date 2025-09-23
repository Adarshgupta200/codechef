import java.util.HashMap;
import java.util.Map;
import java.util.*;
class MajorityElement169 {
    public static int majority(int [] arr){
        int n = arr.length;
        Map<Integer, Integer> ad = new HashMap<>();
        for(int num : arr){
            ad.put(num, ad.getOrDefault(num, 0) + 1);
            if(ad.get(num)> 2/n){
                return num;
            }
        }
    }
    return -1;
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(majority(arr));
    }
}
