class lastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder()); //maxheap
        for(int stone : stones){
            minheap.add(stone);
        }
        while(minheap.size() > 1){
            int stoneOne = minheap.remove();
            int stoneTwo = minheap.remove();
            if(stoneOne != stoneTwo){
                minheap.add(stoneOne-stoneTwo);
            }
        }
        return minheap.isEmpty() ? 0 : minheap.remove();
        
    }
}
