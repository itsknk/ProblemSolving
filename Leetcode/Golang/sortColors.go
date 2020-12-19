func sortColors(nums []int)  {
    start := 0
    end := len(nums)-1
    index := 0
    for (index <= end && start < end){
        if nums[index] == 0 {
            nums[index] = nums[start]
            nums[start] = 0
            index++
            start++
        } else if nums[index] == 2 {
            nums[index] = nums[end]
            nums[end] = 2
            end--
        } else {
            index++
        }
    }
}
