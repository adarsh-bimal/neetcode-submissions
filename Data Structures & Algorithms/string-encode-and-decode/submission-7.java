class Solution {

    public String encode(List<String> strs) {
        ArrayList<Integer> sizes = new ArrayList<>();
        StringBuffer res = new StringBuffer();
        for(String str : strs){
            sizes.add(str.length());
        }
        for(int size:sizes){
            res.append(size).append(',');
        }
        res.append("#");
        for(String str:strs){
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        ArrayList<Integer> sizes = new ArrayList<>();
        List<String> res =  new ArrayList<>();

        int i = 0;
        while(str.charAt(i)!= '#'){
                   StringBuffer arr = new StringBuffer();

            while(str.charAt(i)!=','){
                arr.append(str.charAt(i));
                i++;
            }
            i++;
            sizes.add(Integer.parseInt(arr.toString()));
        }
        i++;
        for(int size:sizes ){
            res.add(str.substring(i,i+size));
            i+= size;
        }
        return res;
    }
}
