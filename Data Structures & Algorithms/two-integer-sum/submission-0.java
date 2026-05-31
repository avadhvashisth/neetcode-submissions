class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int val1 = nums[i];
            int val2 = target - nums[i];
            if(map.containsKey(val2)){
                return new int[]{map.get(val2), i};
            }
            map.put(val1, i);
        }
        return new int[]{-1, -1};
    }
}
