public class removeduplicates {

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removedupli(arr));
    }
    

    static int removedupli(int[] arr){
        int i=1;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i-1]){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
