public class longestcommonprefix{
    public static void main(String[] args) {
        String[] s={"clubhouse","clu","club"};
        System.out.println(longess(s));
    }

    public static String longess(String[] s){
        if(s==null || s.length==0){
            return "";
        }
        String first=s[0];

        for(int index=0;index<first.length();index++){
            char currentChar=first.charAt(index);

            for(int i=1;i<s.length;i++){
                if(index>=s[i].length() || s[i].charAt(index)!=currentChar){
                    return first.substring(0, index);
                }
            }
        }
        return first;
    }
}