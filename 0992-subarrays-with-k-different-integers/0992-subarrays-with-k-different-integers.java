class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        //Brute Appraoch
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     HashMap<Integer,Integer> map = new HashMap<>();
        //     for(int j=i;j<n;j++){
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //         if(map.size()==k){
        //             count++;
        //         }
        //         if(map.size()>k){
        //             break;
        //         }
        //     }
        // }
        // return count;
         return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    public int atMostK(int[] nums, int k) {
        int l = 0, count = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);

            while (mpp.size() > k) {
                mpp.put(nums[l], mpp.get(nums[l]) - 1);
                if (mpp.get(nums[l]) == 0) {
                    mpp.remove(nums[l]);
                }
                l++;
            }

            count += (r - l + 1);
        }
        return count;
    }
}