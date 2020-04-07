class countElem {
    public int countElements(int[] arr) {
        int count =0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i]+1));
            else
                map.put(arr[i],1);
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]) && map.containsKey(arr[i]+1))
                count++;
        }
        return count;
       
    }
}
