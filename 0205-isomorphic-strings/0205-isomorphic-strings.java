class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //Brute Solution

        // if (s == null || t == null) return s == t; 
        // if (s.length() != t.length()) return false;
        // int n = s.length();

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         boolean sameInS = s.charAt(i) == s.charAt(j);
        //         boolean sameInT = t.charAt(i) == t.charAt(j);
        //         if (sameInS != sameInT) {
        //             return false;
        //         }
        //     }
        // }
        // return true;

        //Optimal Solution
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!charMap.containsKey(original)){
                if(!charMap.containsValue(replacement)){
                    charMap.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedCharacter=charMap.get(original);
                if(mappedCharacter!=replacement){
                    return false;
                }
            }
        } 
        return true;
    }
}