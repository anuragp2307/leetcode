class Solution {
    public int maxArea(int[] height) {
        int max_water=0;
        int Left=0; int Right=height.length-1;
        while(Left<Right){
            int width=Right-Left;
        
        int currheight=Math.min(height[Left], height[Right]);
        int area= currheight * width;
        max_water=Math.max(area,max_water);
        if (height[Left] < height[Right]){
           Left+=1; 
        }
        else{
            Right-=1;
        }
        
    }
    return max_water;
    }
}

