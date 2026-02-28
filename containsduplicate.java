import java.util.HashSet;
import java.util.Set;

public class containsduplicate {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6,7,8,9,10};
        System.out.println(containsdupli(arr));
    }

    static boolean containsdupli(int[] arr){
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i]))
                return true;
            else
                st.add(arr[i]);
        }
        return false;
    }

    
}
