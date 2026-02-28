import java.util.*;
public class twosum{
    public static void main(String[] args) {
        int[] arr={2,7,9,3};
        int target=5;
        System.out.println(Arrays.toString(sumtwo(arr,target)));
    }

    static int[] sumtwo(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);    
            }
            return new int[]{-1,-1};
    }
}
    

