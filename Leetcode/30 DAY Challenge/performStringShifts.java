class performStringShifts {
    public String stringShift(String s, int[][] shift) {
        int temp =0;
        
        int n = s.length();
        for(int i=0; i<shift.length; i++){
            int dir = shift[i][0];
            int ans = shift[i][1];
            if(dir == 0){
                temp += ans;
            }
            else{
                temp -= ans;
            }
        }
        temp = ((temp % n) + n) % n;
        return s.substring(temp)+s.substring(0,temp);
    }
}
