class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1;
        Arrays.sort(nums);
        while(Arrays.binarySearch(nums,i)>=0)
        {
            i++;
        }
        return i;
    }
       /** public static int binarySearch(int[] arr, int target)
        {
            int mid, left=0, right=arr.length-1;
            while(left <= right)
            {
                mid = left+(right-left)/2;
                if(mid == target)
                {
                    return mid;
                }
                if(target < arr[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            return -1;
        }*/
    
}
