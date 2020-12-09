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

//0ms
class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int low =0, high = height.length-1, ans=0;
        int left = height[low];
        int right = height[high];
        while(low <= high)
        {
            left = Math.max(left, height[low]);
            right = Math.max(right, height[high]);
            if(left<right)
            {
                ans += left - height[low];
                low++;
            }
            else
            {
                ans += right - height[high];
                high--;
            }
        }
        return ans;
    }
}
