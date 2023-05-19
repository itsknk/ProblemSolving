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
       /*public static int binarySearch(int[] arr, int target)
        {
            int mid, left=0, right=arr.length-1;
            while(left <= right)
            {
                mid = left+(right-left)/2;
                if(arr[mid] < target)
                {
                    left = mid+1;
                }
                else if(arr[mid] > target)
                {
                    right = mid-1;
                }
                else
                {
                    return mid;
                }
            }
            return -1;
        }*/
    
}
