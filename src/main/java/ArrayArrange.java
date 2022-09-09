public class ArrayArrange {
    public static void main(String args[]){
       int[] arr = new int[]{7,1,3,2,4,5,6};
       int swaps = minimumSwaps(arr);
       System.out.println(swaps);
    }
    static int minimumSwaps(int[] arr) {
        int swaps = 0,d;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==i+1){
                        swaps = swaps+1;
                        d=arr[i];
                        arr[i]=arr[j];
                        arr[j]=d;
                        break;
                    }
                }
            }
        }
        return swaps;
    }
    static int minimumSwap(int[] arr) {
        int swap=0;
        for(int i=0;i<arr.length;i++){
            if(i+1!=arr[i]){
                int t=i;
                while(arr[t]!=i+1){
                    t++;
                }
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
                swap++;
            }
        }
        return swap;
    }
}
