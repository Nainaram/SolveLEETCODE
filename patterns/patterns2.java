

// this is the pattern programs folder to built the logic stronger.
public class patterns2{
    static void pattern2(int n){
        for(int i= 1;i<=n;i++){
            for(int j = 1 ; j <=i;j++){
            System.out.print( "*");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }
}