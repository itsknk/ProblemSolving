func removeDuplicates(nums []int) int {
    if nums == nil || len(nums) == 0{
      return 0  
    }
    a := 2
    for b:=2; b<len(nums); b++{
        if nums[a-2] != nums[b]{
            nums[a] = nums[b]
            a++
        }
    }
    return a    
}
