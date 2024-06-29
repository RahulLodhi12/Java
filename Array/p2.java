package Array;

public class p2 {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        
        System.out.println(mat.length);
        System.out.println(mat[0].length);

        int mat1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat1.length;
        int m = mat1[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
