package Array;

public class p1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        arr[0] = 13;
        arr[1] = 26;
        arr[2] = 36;
        arr[3] = 46;
        arr[4] = 56;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("arr[3]: " + arr[3]);

        int arr1[] = {132,221,33,44,55};

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
