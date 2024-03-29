/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numsSet = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(numsSet.contains(nums[i])){
                return true;
            }
            numsSet.add(nums[i]);
        }

        return false;

        //old messy approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // boolean flag = false;
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.get(nums[i]) != null)
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     else
        //         map.put(nums[i], 1);
        // }
        // for (Integer i : map.values()) {
        //     if (i > 1) {
        //         flag = true;
        //         break;
        //     }
        // }
        // return flag;
    }
}
// @lc code=end
