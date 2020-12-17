func searchInsert(nums []int, target int) int {
    count := 0
    for i:=0; i<len(nums); i++ {
        if nums[i] == target || nums[i] > target{
            return count
        }
        count++
    }
    return count
}
