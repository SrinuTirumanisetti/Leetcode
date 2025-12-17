class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxLen=0;
        //Brute Force
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         set.add(fruits[j]);
        //         if(set.size()<=2){
        //             maxLen=Math.max(maxLen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;

        //Optimal Solution
        int start=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>=3){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0) map.remove(fruits[start]);
                start++;
            }
            int len=right-start+1;
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}