func reverse(x int) int {
    rev := 0
    for x!=0 {
        ld := x%10
        x /= 10
        rev = (rev*10)+ld
    }
     if rev > math.MaxInt32 || rev < math.MinInt32 {
            return 0
        }
    return rev
}
