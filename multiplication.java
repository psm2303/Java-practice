public class Multiplication{
    public static void main(String[] args) {
        int outerCounter = 0;
        int[] innerArray = {1,2,3,4,5};
 
        while(outerCounter<7){
            System.out.println();
            for(int number : innerArray){
                System.out.print(number * outerCounter + " ");
            }
            outerCounter++;
        }
               
    }
}