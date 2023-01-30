class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0;
        for(int i=1-n;i<m;i++) // a loop of m+n size to slide both the arrays 
        {
            int c=0;
            for(int j=0;j<n;j++) //restricts the number of elements to be slided in every iteration
            {
                if(i+j<0) //omit the negative index
                continue;
            else
                if(i+j>=m) //arrays are slided and loop should exit now
                    break;
            else
                if(nums2[i+j]==nums1[j]) //checking the continuity of similar subarray
                {
                    c++;
                    ans=Math.max(c,ans);
                }
            else //if continuity is broken then reset the temporary count to 0
                c=0;
            }
        }
        return ans;
    }
}
