//use HashSet to store values
//check for value in set 
//if present return true
//else return false as no duplicate value is present

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}