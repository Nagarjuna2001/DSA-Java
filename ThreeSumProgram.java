class ThreeSumProgram {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i-1]!=nums[i])){
            int sum = 0-nums[i];
            int start = i+1;
            int end = nums.length-1;
            
            //find bug in this, thats why left as it is
            while(start < end){
                if(nums[start] + nums[end] == sum){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<nums.length-2 && nums[start]==nums[start+1]){
                        start++;
                    }
                    while(end > 1 && nums[end]==nums[end-1]){
                        end--;
                    }
                    start++;
                    end--;
                }
                else if(nums[start] + nums[end] < sum){
                    start++;
                }
                else end--;
            }}
        }
        return ans;
    }
}