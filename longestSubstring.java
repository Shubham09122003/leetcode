import java.util.HashSet;
import java.util.Set;
class longestSubstring {
    public static int lengthOfLongestSubstring(String s) {
      Set<Character>st=new HashSet<>();
       int max_size=0,left=0;
       for(int right=0;right<s.length();right++){
           if(!st.contains(s.charAt(right))){
            st.add(s.charAt(right));
             max_size=Math.max(max_size,right-left+1);
           }
           else{
               if(st.size()>max_size){
                  ;
               }
               while(st.contains(s.charAt(right))){
                   st.remove(s.charAt(left));
                   left++;
               }
               st.add(s.charAt(right));
           }
           
       }
       return max_size;
    }


    public static void main(String[] args) {
        String st="Shubham Chauhan";
        System.out.println(lengthOfLongestSubstring(st));
    }
}