class Solution {
    public int[] productExceptSelf(int[] nums) {
    int len  = nums.length;
    int[] l = new int[len];
    int[] r = new int[len];
    int[] p = new int[len];
    for(int i = 0; i< len ; i++){
        if( i == 0 ){
            l[0] = 1;
        }
        
        else{
            l[i] = l[i -1]*nums[i-1];
            
        }
    }
    for(int i = 0; i< len ; i ++){
        if(i == 0){
            r[len - 1] = 1; 
        }
        else{
            r[len - 1 - i] = r[len -i  ] * nums[ len -i];
        }
    }
    for(int i = 0; i< len ; i++){
        p[i] = l[i]*r[i];
    }
    return p;
    }
}
