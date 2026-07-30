class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int count1=0,count2=0;
        if(s.length() != t.length())
        return false;

        for(int i = 0; i< s.length();i++){
            arr[sarr[i]-'a']++;
        }
        for(int j = 0; j< t.length(); j++){
            arr[tarr[j]- 'a']--;
        }
        for(int i = 0; i<26;i++){
            if (arr[i]!=0)
            return false;
        }
        return true;
    }
}
