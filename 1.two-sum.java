/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        //hashmap
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;

        //sliding window
        // Arrays.sort(nums);
        // int i = 0, j = nums.length - 1;
        // while (i < j) {
        //     if (nums[i] + nums[j] == target)
        //         break;
        //     else if (nums[i] + nums[j] < target)
        //         i++;
        //     else
        //         j--;
        // }
        // int idx1 = -1;
        // int idx2 = -1;
        // for (int k = 0; k < arr.length; k++) {
        //     if (idx1 == -1 && arr[k] == nums[i])
        //         idx1 = k;
        //     else if (idx2 == -1 && arr[k] == nums[j])
        //         idx2 = k;
        // }
        // return new int[] { idx1, idx2 };

        //brute-force approach
        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target && i!=j){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // throw new IllegalArgumentException("aa");
    }
}
// @lc code=end
