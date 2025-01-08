import java.util.*;
public class canPlaceFlower {

            public static void main(String[] args) {
                Scanner scanner  = new Scanner(System.in);
                int n =scanner.nextInt();
                int flowerbed[] =new int [n];
                int k = scanner.nextInt();
                    System.out.println(canPlantFlower(flowerbed,k));
                // here it is calling canPlantFlower method to k plants if all the k plants are placed then it return true or else false

            }
public static boolean canPlantFlower(int flowerbed[] ,int n ){

                int size = flowerbed.length;
            // first check the base condition 
            // means  in the intially there are no flowers to add to the flowerbed then return true or else next condition is checked
            if(n==0){
                return true;
            }
            // we have to increament by +=2 because no two flowers to be adjacent to one another
            for(int i=0;i<size;i+=2){
                // check the where there is empty flowerbed means index element to be zero
                 if(flowerbed[i] == 0){
                    // this return true if right element to the current element is 0 or the it is last element of the flowerbed
                    boolean isRightEmpty = i+1==flowerbed.length|| flowerbed[i+1]==0;
                    if(isRightEmpty){
                        // if it is true then reduce the flowers n--
                        n--;
                        // then check if there any flower left to be planted if n ==0 then we have planted all the flowers
                        if(n==0)
                        {
                            return true;
                        }
                    }
                    else{
                            // if the right element is not last element or next element to the current element is not empty 
                            //then increase the step by +1
                            i+=1;
                    }
                 }

            }
            // finally if there no empty beds to plant the flower 
            // then return false;
            return false;
}
     }

