//Problem 179
//It was taken from www.projecteuler.net
//Problem want you to find the number of integers 1 < n < 107, for which n and n + 1 have the same number of positive divisors
package problem179;

import java.util.ArrayList;

public class Problem179 {

    public static int limit = (int)Math.pow(10, 5);   

    public static int findDivisor(int number) { //this method was created to find number's divisors
        
        int count=0; //It holds the number of divisors 
        for (int i = 1; i <= number/2; i++) {
            if (number % i != 0) {
                continue;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int count = 0; 
        ArrayList<Integer> divisorArray = new ArrayList<Integer>(); //Dynamic ArrayList to hold all numbers' divisor numbers between 1 to 10^5
        
        divisorArray.add(findDivisor(1)); //implement first input
        for( int i = 2 ; i <= limit; i++ )
        {
            divisorArray.add(findDivisor(i)); //then implement second input
            if(divisorArray.get((i-2)).equals(divisorArray.get((i-1)))) //check if they are equal or not
                count++;
            else ;
        }
        
        System.out.println(count);
    }

}
