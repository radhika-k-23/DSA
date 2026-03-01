public class buysell {
    public static void main(String[] args) {
        int[] arr={7,1,6,5,3};
        System.out.println(profit(arr));
    }

    static int profit(int[] arr){

        int min=arr[0];
        int maxprofit=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int profit=arr[i]-min;
            min=Math.min(arr[i],min);
            maxprofit=Math.max(profit,maxprofit);
        }
         if(maxprofit<0){
            return 0;
         }
         return maxprofit;
    }
}
