class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        boolean[] inStack = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            
            if (inStack[c - 'a']) {
                continue;
            }
            
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                inStack[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            sb.append(c);
            inStack[c - 'a'] = true;
        }
        
        return sb.toString();
    }
}