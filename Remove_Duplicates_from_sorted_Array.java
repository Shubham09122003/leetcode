//set i=0;
// j=0;
//if elem i != elem j
// set i++ then set elem i = elem j
//retrn i+1;
class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int j=0;j<nums.length;j++){
           if(nums[i]!=nums[j]){
               i++;
               nums[i]=nums[j];
           }
       }
       return i+1;
    }
}