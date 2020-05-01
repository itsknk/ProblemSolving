class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray(); //strings in char array
            Arrays.sort(c); //sorted
            String sortone = new String(c); // sorted string
            if(!map.containsKey(sortone)){
                map.put(sortone, new ArrayList<>());
                
            }
            map.get(sortone).add(strs[i]); //if the map has the sorted element then add the current string to it
           
        }
        result.addAll(map.values());
        return result;
    }
}
