func trap(height []int) int {
    if len(height) == 0 {
        return 0
    }
    low:=0
    high:=len(height)-1
    ans:=0
    left:=height[low]
    right:=height[high]
    for low<=high {
        left = Maxx(left,height[low])
        right = Maxx(right, height[high])
        if left < right {
            ans += left - height[low]
            low++
        } else {
            ans += right - height[high]
            high--
        }
    }
    return ans
}

   func Maxx(x int, y int) int {
        if x < y{
            return y
        }
        return x
    }
