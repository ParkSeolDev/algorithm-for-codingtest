package Hash;

import java.util.HashSet;
import java.util.Set;

class Pro폰켓몬 {
    public int solution(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }

        return Math.min(hashSet.size(), nums.length / 2);
    }
}
