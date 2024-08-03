// package patterns;

// this is the pattern programs folder to built the logic stronger.
public class patterns12{
    static void pattern12(int n){
        int starts = 1;
        for(int i =0;i<n;i++){
            if(i%2==0)
                starts = 1;
            else
                starts =0;
            for(int j = 0;j<=i;j++){
                System.out.print(starts + " ");
                starts = 1-starts;
            }
            System.out.println();
        }
           
       
    }
    
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }
}