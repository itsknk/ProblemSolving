class numberComplement {
    public int findComplement(int num) {
        int ans =0;
        int power = 1;
        while(num > 0){
            ans+=(num%2 ^ 1) * power;
            power <<=1;
            num>>=1;
        }
        return ans;
    }
}
