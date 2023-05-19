class CombinationIterator {

   ArrayList<String> comb;
    int pointer, len;
    public CombinationIterator(String characters, int combinationLength) {
        this.arr = new ArrayList<>();
        this.pointer = 0;
        this.len = combinationLength;
        this.combinations(characters, 0, "");
    }
    public void combinations(String s, int index, String com){
        if(com.length() == this.len){
            this.arr.add(com);
            return ;
        }
        if(index >= s.length()) return ;
        for(int i = index; i < s.length(); i++)
            combinations(s, i + 1, com + String.valueOf(s.charAt(i)));
    }
    public String next() {
        return this.arr.get(this.pointer++);
    }
    
    public boolean hasNext() {
        return this.pointer < this.arr.size();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
