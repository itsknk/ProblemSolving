class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> ans = new ArrayList();
        int[] current = intervals[0];
        ans.add(current);
        for(int[] interval : intervals){
            int current_first = current[0];
            int current_last = current[1];
            int next_first = interval[0];
            int next_last = interval[1];
            if(current_last >= next_first){
                current[1] = Math.max(current_last, next_last);
            }
            else{
                current = interval;
                ans.add(current);
            }
        }
        
        
        return ans.toArray(new int[ans.size()][]);
    }
}
