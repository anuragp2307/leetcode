class Solution {
    public int romanToInt(String s) {
        int ans = 0;  
        int last = 0;   

      
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int curr = 0;  
            switch (ch) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }
            if (curr < last) {
                ans = ans - curr;
            } else {
                ans = ans + curr;
            }
            
            last = curr;
        }
        
        return ans;
    }
}