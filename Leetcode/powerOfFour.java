class powerOfFour {
    public boolean isPowerOfThree(int num) {
        long i = 1;
        while(i<num){
            i *= 4;
        }
        return i == num;
    }
}
