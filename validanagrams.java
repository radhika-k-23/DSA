import java.util.*;
public class validanagrams{
    public static void main(String[] args) {
       String s="anagram";
       String t="nngaram";
       System.out.println(isvalidst(s,t));

    }

    public static boolean isvalidst(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        
        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c=0;c<count.length;c++){
            if(count[c]!=0){
                return false;
            }
            
        }
        return true;
    }
}