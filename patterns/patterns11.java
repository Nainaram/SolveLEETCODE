

// this is the pattern programs folder to built the logic stronger.
public class patterns11{
    static void pattern11(int n){
        for(int i= 1;i<=2*n-1;i++){
            int  stars=i;
            if(i>n) 
            stars=2*n-i;
           for(int j = 1;j<=stars;j++){
            
            System.out.print("*");
           }
           
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern11(n);
    }
}