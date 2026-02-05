class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=nums[low]){
                if(ans>nums[low]){
                    ans=nums[low];
                }
                low=mid+1;
            }
            else{
                if(ans>nums[mid]){
                    ans=nums[mid];
                }
                high=mid-1;
            }
        }
        return ans;
    }
}