class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            // Jab tak num current value se bada ya barabar hai
            while (num >= values[i]) {
                num -= values[i];          // Value subtract karo
                sb.append(symbols[i]);     // Symbol add karo
            }
        }
        
        return sb.toString();
    }
}