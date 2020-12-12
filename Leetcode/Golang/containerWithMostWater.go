func maxArea(height []int) int {
    ans := 0
    i := 0
    j := len(height)-1
    for i < j {
        if height[i] < height[j]{
            ans = max(ans, height[i] * (j-i))
            i++
        }else{
            ans = max(ans, height[j] * (j-i))
            j--
        }
    }
    return ans
}
  func max(a int, b int) int {
        if a < b{
            return b
        }else{
            return a
        }
    }
