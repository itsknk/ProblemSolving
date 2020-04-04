/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
   int *temp = (int *) malloc(sizeof(int) * 2);
    int i,j,k,l;
    for(i=0;i<numsSize;++i){
        k=nums[i];
        for(j=i+1;j<numsSize;++j){
            l=nums[j];
            if((k+l)==target)
        {
            temp[0]=i;
            temp[1]=j;
            return temp;
        }
        }
    }
        
    
   return temp; 
}
