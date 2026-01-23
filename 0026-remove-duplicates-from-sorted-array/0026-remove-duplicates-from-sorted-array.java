class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
         int n = nums.length;
        // for(int i=0;i<n;i++){
        //     set.add(nums[i]);
        // }
        // int k = set.size();
        // int j=0;
        // for(int x:set){
        //     nums[j]=x;
        //     j++;
        // }
        // return k;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}