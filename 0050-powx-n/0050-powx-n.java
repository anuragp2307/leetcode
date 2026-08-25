class Solution {
    public double myPow(double x, int n) {
        long exponent = n; 
        
        if (exponent < 0) {
            exponent = -exponent;
        }
         
        double result = 1.0;
        
        while (exponent > 0) {
           
            if (exponent % 2 == 1) {
                result = result * x;
                exponent=exponent -1;
            }  
            else {
                x = x * x;
                exponent = exponent / 2;
            }
        }
       
        if (n < 0) {
            result = 1.0 / result;
        }
        
        return result;
    }
}