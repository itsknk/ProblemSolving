class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int result =0, level =0, left =0, right =height.length-1;
        while(left<right){
            int low = height[height[left]<height[right] ? left++ : right--];
            level = Math.max(level,low);
            result+= level-low; 
        }
        return result;
    }
}
