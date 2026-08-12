class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int len  = s.length();
        int l = 0;
        int r = len -1;
        char[] charArray = s.toCharArray();

        while(l< r){
            if(charArray[l] != charArray[r]){
                return false;
            }
            r--;
            l++;

        }
        return true;
    }
}
