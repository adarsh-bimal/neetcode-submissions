class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
    set.add(num);
}
        int count = 1;
        int maxcount = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(!set.contains(nums[i] - 1)){
                for(int j = 1; j< nums.length ; j++){
                    if(set.contains(nums[i] + j)){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
            if (count > maxcount)
            maxcount  = count;
            count = 1;
        }
        return maxcount;
    }
}
