public class RotateMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(a);
        reverse(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static void transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <=i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }
    }
    static void reverse(int[][] a)
    {
        for(int i=0;i<a.length;i++){
            int left=0;
            int right=a.length-1;
            while(left<right)
            {
                int temp=a[i][left];
                a[i][left]=a[i][right];
                a[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}
//! Question Link (48)-> https://leetcode.com/problems/rotate-image/description/
