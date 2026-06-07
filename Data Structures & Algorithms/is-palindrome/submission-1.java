class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;

        while(i < j){
            while(i < n && !isAlphaNumeric(s.charAt(i)))
                i++;

            while(j >= 0 && !isAlphaNumeric(s.charAt(j)))
                j--;

            if(i > j)
                break;

            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if(a != b)
                return false;
            
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c){
        return (c >= 'A' && c <= 'Z') ||
        (c >= 'a' && c <= 'z') ||
        (c >= '0' && c <= '9');
    }
}
