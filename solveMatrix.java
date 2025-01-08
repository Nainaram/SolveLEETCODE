import java.util.*;
public class solveMatrix {
    // this is the code to print the code diagonally with  increased count of the number 
    // this is the coding question asked by the zoho  in decemeber recruitment.
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n =scanner.nextInt();
                int number =1;
                int matrix [] [] = new int [n][n];
                for(int i=0;i<n;i++){
                    for(int row =0,col =i;row<n&&col>=0;row++,col--){
                        matrix [row][col] =number++;
                    }
                }
                for(int i = 1;i<n;i++){
                    for(int row =i , col  = n -1;col>=0&& row<n;row++,col--){
                        matrix[row][col] = number++;
                    }
                }
                for(int i=0;i<n;i++){
                    for(int j =0;j< n;j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }
    }
}
