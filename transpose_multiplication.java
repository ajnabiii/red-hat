import java.util.*;

public class transpose_multiplication {
    static Scanner sc = new Scanner(System.in);

    public static int[][] multiplication(int [][]m1, int r1, int c1, int[][] m2, int r2, int c2){
        int [][] result = new int [r1][c2];

        for(int i=0;i<r1;i++){    
            for(int j=0;j<c2;j++){      
                for(int k=0;k<r2;k++){      
                    result[i][j]+=m1[i][k]*m2[k][j];      
                }
            }
        }    
        return result;

    }
    public static int[][] transpose (int [][] m, int r, int c){
        int t[][] = new int [r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[i][j] = m[j][i];
            }
        }
        return t;
    }

    public static int[][] create (int r, int c){
        int m[][] = new int [r][c];
        System.out.println("Enter the elements for matrix : ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j] = sc.nextInt();
            }
        }
        return transpose(m, r, c);
    }

    public static void main(String[] args) {

        //Enter the row and column for matrix-1
        System.out.print("Enter the no.of rows for matrix-1 : ");
        int r1 = sc.nextInt();

        System.out.print("Enter the no.of columns for matrix-1 : ");
        int c1 = sc.nextInt();

        // intializing matrix-1
        int m1 [][] = new int [r1][c1];

        // It creates and transposes the matrix-1
        m1 = create(r1,c1);

        //Enter the row and column for matrix-2
        System.out.print("Enter the no.of rows for matrix-2 : ");
        int r2 = sc.nextInt();

        System.out.print("Enter the no.of columns for matrix-2 : ");
        int c2 = sc.nextInt();

        // intializing matrix-2
        int m2 [][] = new int [r2][c2];

        // It creates and transposes the matrix-2
        m2 = create(r2,c2);

        //Resultant matrix
        int result [][] = new int[r1][c2];

        //After multiplication
        result = multiplication(m1, r1, c1, m2, r2, c2);
        result = transpose(result, r1, c2);

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



    }
}
