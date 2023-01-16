class Solution {
    public boolean isPossible(int[] nums) {
    
        HashMap<Integer,Integer> m = new HashMap<>();
        
        
        HashMap<Integer,Integer> n = new HashMap<>();
        
       
        for(int i : nums){
            m.put(i, m.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<nums.length;i++){
          
            if(m.get(nums[i])<=0){
                continue;
            }
            
            else if(n.getOrDefault(nums[i],0)>0){
                m.put(nums[i], m.getOrDefault(nums[i],0)-1);
                
                
                n.put(nums[i], n.getOrDefault(nums[i],0)-1);
                
                
                n.put(nums[i]+1, n.getOrDefault(nums[i]+1,0)+1);
            }
            
            
            else if(m.getOrDefault(nums[i],0)>0 && m.getOrDefault(nums[i]+1,0)>0 && m.getOrDefault(nums[i]+2,0)>0){
                
                
                m.put(nums[i], m.getOrDefault(nums[i],0)-1);
                m.put(nums[i]+1, m.getOrDefault(nums[i]+1,0)-1);
                m.put(nums[i]+2, m.getOrDefault(nums[i]+2,0)-1);
                
              
                n.put(nums[i]+3, n.getOrDefault(nums[i]+3,0)+1);
            }
            
          
            else{
                return false;
            }
        }

        return true;
    }
}
