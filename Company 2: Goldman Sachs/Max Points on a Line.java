class Solution {
    public int maxPoints(int[][] arr) {
        int n=arr.length;
        if(n==1)
            return n;
        int res=0;
        for(int i =0;i<n;i++)
        {
            HashMap<Double,Integer> uwu=new HashMap<>();
            int max=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                double dy=(double)(arr[j][1]-arr[i][1]);
                double dx=(double)(arr[j][0]-arr[i][0]);
                double theta=Math.atan(dy/dx);
                uwu.put(theta,uwu.getOrDefault(theta,0)+1);
                max=Math.max(max,uwu.getOrDefault(theta,0));
            }
            res=Math.max(res,max+1);
        }
        return res;
    }
}
