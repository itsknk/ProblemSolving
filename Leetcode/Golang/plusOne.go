func plusOne(digits []int) []int {
    for i:= len(digits)-1; i >= 0; i--{
        if(digits[i] != 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    digitsLength := len(digits)+1
    ans := make([]int, digitsLength)
    ans[0] = 1
    return ans
}