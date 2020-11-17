func twoSum(nums []int, target int) []int {
    m := make(map[int]int)
    ans := make([]int, 2)
    for i:=0; i<len(nums); i++{
        diff := target - nums[i]
        if v, found := m[diff]; found {
            ans[0] = v
            ans[1] = i
            return ans
        }
        m[nums[i]] = i
    }
    return ans
}