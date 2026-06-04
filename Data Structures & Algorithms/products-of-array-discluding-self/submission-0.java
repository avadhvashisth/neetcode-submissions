class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        long product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
                continue;
            }

            product = product * nums[i];
        }

        if(zeroCount == 0){
            for(int i = 0; i < nums.length; i++){
                long val = product / (long)nums[i];
                res[i] = (int)val;
            }
        }
        else if(zeroCount == 1){
            res[zeroIndex] = (int)product;
            return res;
        }

        return res;
    }
}  
