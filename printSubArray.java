

public class printSubArray {
    public static void subArr(int[] arr){
        int n = arr.length;
        for(int start = 0; start < n; start++){
            for(int end = start; end<n; end++){
                for(int i = start; i<= end; i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] ary = {1,3,5,7,9,0};
        subArr(ary);
    }
}
