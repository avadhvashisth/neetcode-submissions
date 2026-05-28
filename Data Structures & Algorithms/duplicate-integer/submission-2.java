class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;

        HashSet<Integer> map = new HashSet<Integer>();
        map.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(map.contains(nums[i]))
                return true;
            map.add(nums[i]);
        }
        return false;
    }
}