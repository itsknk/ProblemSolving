func removeDuplicates(nums []int) int {
    index :=1 
    for i:=1; i<len(nums); i++{
        if(nums[i-1]!=nums[i]){
            nums[index] = nums[i]
            index++
        }
    }
    return index
}