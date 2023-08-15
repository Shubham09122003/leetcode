class Solution {
    public static boolean isAlphanumeric(Character ch){
        if(ch>='a' && ch<='z' || ch>='0'&&ch<='9'){
            return true;
        }else{
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(j>i){
            if(!isAlphanumeric(s.charAt(i))){
                while(i<j && !isAlphanumeric(s.charAt(i))){
                    i++;
                }
            }
            if(!isAlphanumeric(s.charAt(j))){
                while(j>i && !isAlphanumeric(s.charAt(j))){
                    j--;
                }
            }
            if(isAlphanumeric(s.charAt(i)) && isAlphanumeric(s.charAt(j))){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}