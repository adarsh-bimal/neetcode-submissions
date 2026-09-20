class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[len];
        for(int i = 0; i< len;i++){
            while(!stack.isEmpty() && temp[i]> temp[stack.peek()]){
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }
}
