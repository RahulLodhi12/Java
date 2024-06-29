package Array;

public class p4 {
    public static int [] func(){
        return new int[] {1,2,3,4};
    }
    public static void main(String[] args) {
        int arr[] = func();

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
