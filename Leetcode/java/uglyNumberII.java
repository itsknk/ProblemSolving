class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly = new ArrayList<>();
        ugly.add(1);
        int two =0;
        int three = 0;
        int five = 0;
        while(ugly.size() < n){
            int min = Math.min(ugly.get(two)*2,Math.min(ugly.get(three)*3, ugly.get(five)*5)); 
            ugly.add(min);
            if(min == ugly.get(two)*2){
                two++;
            }
            if(min == ugly.get(three)*3){
                three++;
            }
            if(min == ugly.get(five)*5){
                five++;
            }
        }
        return ugly.get(ugly.size()-1);
    }
}
