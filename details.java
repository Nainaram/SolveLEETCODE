// package SolveLEETCODE;
// this is code ,  checks that a array of strings having a details of a senior citizen like phonenum,age,gender ,seatno. 
// problem is to count the number of citizen greater than age 60;
class Solution{
    public int CountCitizens(String [] details){
        int count  =0; 
        for(String detail : details){
            try{
                    String num = detail.substring(11,13);
                    int each = Integer.parseInt(num);
                    if(each > 65){
                    count++;
                    }
                }
                catch(NumberFormatException e){
                System.out.println("Invalid age format: " + detail);
                 }
                catch(StringIndexOutOfBoundsException e){
                System.out.println("Invalid String format: " + detail);
                }
        }
        return count;
    }
}

public class details {
    public static void main(String[] args) {
        String []  details = {"7868190130M7522","5303914400F9211","9273338290FF01000"};
        // if the string is of invalid format it is going to throw an exception and NumberFormatException
        Solution sol = new Solution();
        int result =sol.CountCitizens(details);
        System.out.println(result);
    }
}
