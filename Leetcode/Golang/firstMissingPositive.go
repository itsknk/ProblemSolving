func firstMissingPositive(nums []int) int {
    i:=1
    sort.Ints(nums)
    for binarySearch(nums,i)>=0 {
        i++
    }
    return i
}
func binarySearch(arr []int, target int) int{
    left:=0
    right:=len(arr)-1
    for left<=right {
        mid := left + (right-left)/2
        if arr[mid] < target{
            left = mid+1
        }else if arr[mid] > target{
            right = mid-1
        } else{
            return mid
        }
    }
    return -1
}
