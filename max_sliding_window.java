//use treemap to add all eems of sli

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0,j=i+k-1;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int[] ans=new int[nums.length-k+1];
        while(j<nums.length){
            for(int a=i;a<=j;a++){
                map.put(nums[a],a);
            }
            ans[i]=map.lastKey();
            map.clear();
            i++;
            j++;
        }
        return ans;
    }
}