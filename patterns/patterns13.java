// package patterns;

// this is the pattern programs folder to built the logic stronger.
public class patterns13{
    static void pattern13(int n){
        int spaces = 2*(n-1);
        for(int i =1;i<=n;i++){
            // numbers
           for(int j = 1;j<=i;j++ ){
            System.out.print(j );
           }       
           // spaces
           for(int j = 1;j<spaces;j++)
           {
            System.out.print(" ");
           }
           // numbers
           for(int j = i;j>=1;j-- ){
            System.out.print( j);
           } 
                System.out.println();
                spaces -=2;
        }
           
       
    }
    
    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }
}