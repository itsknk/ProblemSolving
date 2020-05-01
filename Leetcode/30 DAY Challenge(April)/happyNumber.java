class happyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> a = new HashSet<>();
        while(n!=1)
        {
            int current = n;
            int sum=0;
            while(current != 0)
            {
                sum += (current % 10) * (current % 10);
                current /=10;
            }
            if(a.contains(sum))
                return false;
            
            a.add(sum);
            n=sum;
        }
        return true;
    }
}
