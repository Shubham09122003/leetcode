class Solution {
    public boolean isPalindrome(int x) {
        String n=x+"";
        int i=0,j=n.length()-1;
        while(j>i){
            if(n.charAt(i)!=n.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}