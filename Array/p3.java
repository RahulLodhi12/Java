package Array;

public class p3 {

    public static int solve(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55};

        System.out.println(solve(arr));
    }
}
