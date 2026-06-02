class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : nums) {
            int val = (map.containsKey(num)) ? map.get(num) + 1 : 1;
            map.put(num, val);
            if (val == 1)
                res.add(num);
        }

        res.sort((x, y) -> Integer.compare(map.get(x), map.get(y)));
        // for (int num : res)
        //     System.out.print(num + " ");
        int[] filteredResult = new int[k];
        int len = res.size();
        for (int i = 0; i < k; i++) {
            filteredResult[i] = res.get(len - i - 1);
        }
        return filteredResult;
    }
}
