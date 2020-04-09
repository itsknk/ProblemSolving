class backspaceStrCom {
    public boolean backspaceCompare(String S, String T) {
        int pointerS = S.length()-1;
        int pointerT = T.length()-1;
        int skipS = 0;
        int skipT = 0;
        while(pointerS >=0 || pointerT >=0){
            while(pointerS >= 0){
                if(S.charAt(pointerS) == '#'){
                    skipS += 1;
                    pointerS -= 1;
                }
                else if(skipS > 0){
                    pointerS -= 1;
                    skipS -=1;
                }
                else{
                    break;
                }
            }
              while(pointerT >= 0){
                if(T.charAt(pointerT) == '#'){
                    skipT += 1;
                    pointerT -= 1;
                }
                else if(skipT > 0){
                    pointerT -= 1;
                    skipT -=1;
                }
                else{
                    break;
                }
            }
            if(pointerS >=0 && pointerT >=0 && S.charAt(pointerS)!= T.charAt(pointerT)){
                return false;
            }
            if((pointerS >= 0) != (pointerT >=0)){
                return false;
            }
            
            pointerS-=1;
            pointerT-=1;
        }
        return true;
    }
}
