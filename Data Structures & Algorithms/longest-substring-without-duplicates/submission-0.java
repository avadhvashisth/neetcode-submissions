class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int max = 0;
        while(i < n){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                i = map.get(c);
                map.clear();
            }else{
                i++;
                map.put(c, i);
            }
            max = Math.max(max, map.size());
        }

        return max;
    }
}
