class Solution {
    public int maxSubArray(int[] nums) {
        // int n=nums.length;
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=nums[i];
        //     max=Math.max(sum,max);
        //     for(int j=i+1;j<n;j++){
        //         sum+=nums[j];
        //         max=Math.max(sum,max);
        //     }
        // }
        // return max;

        int n=nums.length;
        int current=0;
        for(int i=0;i<n;i++){
            current+=nums[i];
            max=Math.max(current,max);
            if(current<0){
                current=0;
            }
        }
        return max;
    }
}