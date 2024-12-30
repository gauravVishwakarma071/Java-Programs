/*
 * To Count number of occurence of a digit in a number.
 */
public class CountingOccurence {
    public static void main(String[] args) {
       
            int n = 122263;

            int count = 0;
            while(n>0){
                int re = n % 10; 
                if(re == 2) count++;
                n /= 10;
            }
            System.out.println(count);
        }
}
