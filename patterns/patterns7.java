

// this is the pattern programs folder to built the logic stronger.
public class patterns7{
    static void pattern7(int n){
        for(int i= 1;i<=n;i++){
            // for(int j = n; j >=i;j--){
            for(int j = 1;j<=n-i+1;j++){
            System.out.print( j);
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern7(n);
    }
}