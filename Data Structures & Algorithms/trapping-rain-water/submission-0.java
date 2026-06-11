class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxl = new int[n];
        int[] maxr = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++){
            maxl[i] = max;
            max = Math.max(max, height[i]);
        }

        max = 0;
        for(int i = n - 1; i >= 0; i--){
            maxr[i] = max;
            max = Math.max(max, height[i]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            int min = Math.min(maxl[i], maxr[i]);
            if(min > height[i]){
                sum += min - height[i];
            }
        }

        return sum;
    }
}
