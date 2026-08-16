class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int l = 0; int r = len-1;
        int cur = 0;
        int max = 0;
        while(l<r){
            cur = Math.min(heights[l],heights[r])*(r-l);
            max = Math.max(max, cur);
            if(heights[r]>heights[l]){
                l++;
            }else{
                r --;
            }
        }
        return max;
    }
}
