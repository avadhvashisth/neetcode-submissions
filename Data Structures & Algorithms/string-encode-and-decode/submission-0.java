class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str: strs){
            int len = str.length();
            res.append(len + "#");
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        int len = str.length();
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < len){
            String intStr = "";
            while(str.charAt(i) != '#'){
                intStr = intStr + str.charAt(i);
                i++;
            }

            int templen = Integer.parseInt(intStr);
            char[] tempStr = new char[templen];
            i++;
            for(int j = 0; j < templen; j++){
                tempStr[j] = str.charAt(i);
                i++;
            }

            res.add(String.valueOf(tempStr));
        }
        return res;
    }
}
