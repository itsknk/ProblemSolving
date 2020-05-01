class validParString {
    public boolean checkValidString(String s) {
     int a=0;//for opening 
     int b=0;//for closing
        for(char c : s.toCharArray()){
            if(c == '('){
                a++;
                b++;
            }
            else if(c == '*'){
                a--;
                b++;
            }
            else{
                a--;
                b--;
                if(b<0) break;
            }
            if(a<0) a=0;
        }
        return a ==0;
    }
}
