class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s==null || s.length()==0 || s.length() <p.length()){
            return result;
        }
            int[] pCount= new int[26];
            int[] sCount= new int[26];
            int windowLen=p.length();
            for(int i=0;i<windowLen;i++){
                pCount[p.charAt(i)-'a'] ++;
                sCount[s.charAt(i)-'a'] ++;
            }
            
            if(Arrays.equals(pCount,sCount)){
                result.add(0);
            }
            for(int i = windowLen;i<s.length();i++){
                sCount[s.charAt(i)-'a']++;
                sCount[s.charAt(i-windowLen)-'a']--;
                if(Arrays.equals(pCount,sCount)){
                    result.add(i-windowLen +1);
                }
            }
        
        return result;
    }
}