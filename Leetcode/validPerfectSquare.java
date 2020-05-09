class validPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long a = 2, b = num/2;
        while(a <= b){
            long mid = (a + (b-a)/2);
            long ans = mid*mid;
            if(ans == num){
                return true;
            }
            else if(ans < num){
                a = mid+1;
            }
            else{
                b = mid -1;
            }
        }
        return false;
    }
}
