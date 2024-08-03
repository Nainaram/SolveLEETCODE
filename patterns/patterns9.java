
// this is the pattern programs folder to built the logic stronger.
public class patterns9{
    static void pattern9(int n){
        for(int i= 0;i<n;i++){
           for(int j = 0;j<n-i-1;j++){
            System.out.print(" ");
           }
           for( int j = 0;j<2*i+1;j++){
            System.out.print("*");
           }
           for( int j = 0;j<n-i-1;j++){
            System.out.print(" ");
           }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern9(n);
    }
}