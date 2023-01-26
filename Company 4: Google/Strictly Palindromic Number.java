class Solution {
    public static String base(String number, int sBase, int dBase)
    {
        
        return Integer.toString(
            Integer.parseInt(number, sBase), dBase);
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
    
    public boolean isStrictlyPalindromic(int n) {
        String number=String.valueOf(n);
        for(int i=2;i<=(n-2);i++)
        {
            String str=base(number,10,i);
            if(isPalindrome(str))
                continue;
            else
                return false;
            
        }
        return true;
        
    }
}
