class Solution {
    public int numberOfBoomerangs(int[][] p) {
        int ans=0;
        for(int i=0;i<p.length;i++)
        {
            HashMap<Integer,Integer> uwu=new HashMap<>();
            for(int j=0;j<p.length;j++)
            {
                int d=((p[i][0]-p[j][0])*(p[i][0]-p[j][0]))+((p[i][1]-p[j][1])*(p[i][1]-p[j][1]));
                uwu.put(d,uwu.getOrDefault(d,0)+1);
            }
                for(int a:uwu.values())
                    ans+=a*(a-1);
        }
        return ans;
    }
}
