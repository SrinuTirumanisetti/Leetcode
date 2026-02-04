class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return mostK(nums,k)-mostK(nums,k-1);
    }

    public static int mostK(int[] nums,int k){
        int i=0;
        int odd=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==1) odd++;
            while(odd>k){
                if(nums[i]%2==1) odd--;
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}