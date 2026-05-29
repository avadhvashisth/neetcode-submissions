class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int val = map.containsKey(c) ? map.get(c) + 1 : 1;
            map.put(c, val);
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                int val = map.get(c) - 1;
                if(val == 0)
                    map.remove(c);
                else
                    map.put(c, val);
            }
            else{
                return false;
            }
        }

        return map.size() == 0;
    }
}
