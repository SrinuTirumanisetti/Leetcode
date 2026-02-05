class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        //Brute Approach

        // int max_product=Math.max(Integer.MIN_VALUE,nums[0]);
        // if(n==2){
        //     int product=nums[0]*nums[1];
        //     if(product>nums[0] && product>nums[1]){
        //         return product;
        //     }
        //     else{
        //         return Math.max(nums[0],nums[1]);
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     int product=nums[i];
        //     max_product=Math.max(product,max_product);
        //     for(int j=i+1;j<n;j++){
        //         product=product*nums[j];
        //         max_product=Math.max(product,max_product);
        //     }
        // }
        // return max_product;

        //Optimal Solution
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}