class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int index = 0 , i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(index)){
                lps[i] = index+1;
                i++;index++;
            }else{
                if(index!=0){
                    index = lps[index-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0,lps[n-1]);
    }
}
