class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        int x1=Integer.MAX_VALUE;
        int y1=Integer.MAX_VALUE;
        int x2=Integer.MIN_VALUE;
        int y2=Integer.MIN_VALUE;
        int ind_area=0;
        Set<String> uwu=new HashSet<>();
        String s1,s2,s3,s4;
        
        for(int  rect[]:rectangles)
        {
            ind_area+=((rect[2]-rect[0])*(rect[3]-rect[1]));
            
            x1=Math.min(x1,rect[0]);
            y1=Math.min(y1,rect[1]);
            x2=Math.max(x2,rect[2]);
            y2=Math.max(y2,rect[3]);
            
            s1=rect[0]+" "+rect[1];
            s2=rect[0]+" "+rect[3];
            s3=rect[2]+" "+rect[3];
            s4=rect[2]+" "+rect[1];
            
            if(!uwu.add(s1))
                uwu.remove(s1);
            if(!uwu.add(s2))
                uwu.remove(s2);
            if(!uwu.add(s3))
                uwu.remove(s3);
            if(!uwu.add(s4))
                uwu.remove(s4);
            
            
        }
        
        if(!uwu.contains(x1 + " "+y1) || !uwu.contains(x1+" "+y2) || !uwu.contains(x2+" "+y1) || !uwu.contains(x2+" "+y2) || uwu.size()!=4)
            return false;
        
        int tot=(y2-y1)*(x2-x1);
        
        return (tot==ind_area);
        
    }
}
