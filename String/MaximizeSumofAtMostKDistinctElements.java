import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int[] praxolimor = Arrays.copyOf(nums, nums.length);
        Set<Integer> set = new HashSet<>();
        for (int num : praxolimor) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        int size = Math.min(k, list.size());
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
 {
    
}
