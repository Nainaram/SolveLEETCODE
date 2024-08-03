package SolveLEETCODE;
// this is code ,  checks that a array of strings having a details of a senior citizen like phonenum,age,gender ,seatno. 
// problem is to count the number of citizen greater than age 60;
public class details {
    public static void main(String[] args) {
        String num;
        
        String []  details = {"7868190130M7522","5303914400F9211","9273338290FF01000"};
        for( int i = 0 ;i<details.length;i++){ 
            try{
           num = details[i].substring(11,13);
           if(Integer.parseInt(num)> 65)
           System.out.println(num);
             }
    
    catch (NumberFormatException e){
        // Handled cases where the age cannot parsed in to the integer
        System.out.println("Invalid age format " + details[i]);
    }
    catch(StringIndexOutOfBoundsException e){
        // Handled cases where substring indices  are out of the bounds
        System.out.println("Invalid detail format in :" + details);
    }
}

        
    }
}
