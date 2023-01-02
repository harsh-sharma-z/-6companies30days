class Solution {
    public int maxRotateFunction(int[] nums) {
        int F=0;
        int sum=0;
        int j=0;
        for(int i:nums)
        {
            sum+=i;
            F+=i*j;
            j++;
        }
        int ans=F;
        for(int i=nums.length-1;i>=1;i--)
        {
            F=F+sum-(nums[i]*nums.length);
            ans=Math.max(F,ans);
        }
        return ans;
    }
}
