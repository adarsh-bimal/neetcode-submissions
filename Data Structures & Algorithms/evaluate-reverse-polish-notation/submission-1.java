class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        Stack<Integer> stringStack = new Stack<>();
        int right,left;
        for(int i = 0 ; i< len;i++){
            if(tokens[i].equals("+") ||
   tokens[i].equals("-") ||
   tokens[i].equals("*") ||
   tokens[i].equals("/")){
                right = (stringStack.pop());
                left = (stringStack.pop());
                switch(tokens[i]){
                    case "+":
                    stringStack.push(left+right);
                    break;
                    case "-":
                    stringStack.push(left-right);
                    break;
                    case "*":
                    stringStack.push(left*right);
                    break;
                    case "/":
                    stringStack.push(left/right);
                    break;
                }
               }
               else{
                stringStack.push(Integer.parseInt(tokens[i]));
               }
        }
        return(stringStack.pop());
    }
}
