class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap map = new HashMap<Character, Integer>();
        List<List<String>> result = new LinkedList<List<String>>();
        int[] alreadyAdded = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            // Skip this if already added
            if (alreadyAdded[i] == 1)
                continue;

            String str1 = strs[i];
            // Put the first string in map
            map.clear();
            for (int k = 0; k < str1.length(); k++) {
                char c = str1.charAt(k);
                int val = map.containsKey(c) ? (int) map.get(c) + 1 : 1;
                map.put(c, val);
            }

            // Create a list of strings to store the current string and its anagrams
            List<String> ana = new LinkedList<String>();
            ana.add(str1);

            for (int j = i + 1; j < strs.length; j++) {
                
                String str2 = strs[j];
                // Check if str1 == ""
                if(map.size() == 0){
                    if(str2.equals("")){
                        ana.add(str2);
                        alreadyAdded[j] = 1;
                    }else{
                        continue;
                    }
                }

                // Skip this if already added
                if (alreadyAdded[j] == 1)
                    continue;

                HashMap mapCopy = new HashMap<Character, Integer>();
                mapCopy.putAll(map);

                // Check each char in string 2 and remove chars from mapCopy
                int k = 0;
                for (; k < str2.length(); k++) {
                    char c = str2.charAt(k);

                    if (mapCopy.containsKey(c)) {
                        if ((int) mapCopy.get(c) == 1)
                            mapCopy.remove(c);
                        else
                            mapCopy.put(c, (int) mapCopy.get(c) - 1);
                    } else {
                        break;
                    }
                }

                // If all char removed
                if (mapCopy.size() == 0 && k == str2.length()) {
                    ana.add(str2);
                    alreadyAdded[j] = 1;
                }
            }

            result.add(ana);
        }
        return result;
    }
}
