class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        prefix[0] = 1;
        suffix[len-1] = 1;
        int[] out = new int[len];
        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[len-i-1] = suffix[len-i] * nums[len-i];
        }

        for(int i=0;i<len;i++){
            out[i] = prefix[i]*suffix[i];
        }

        return out;
    }
}