class intersectionOfArrayII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=0,b=0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
       while(a<nums1.length && b<nums2.length){
        if(nums1[a]<nums2[b]){
            a++;
        }else if(nums1[a]>nums2[b]){
            b++;
        }else{
            ans.add(nums1[a]);
            a++;
            b++;
 
        }
    }
        int[] result = new int[ans.size()];
        int index=0;
       while(index<ans.size()){
        result[index]=ans.get(index);
        index++;
    }
 
    return result;
    }
}
