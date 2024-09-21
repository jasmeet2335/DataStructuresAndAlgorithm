package BitManipulation;

public class BitQuestions {
    public static void OddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){ 
            System.out.println("Even number");
        } else {
            System.out.println("odd Number ");
        }
    }

    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << i);
        return n& bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
    }
    
    public static int clearIBits(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearRangeIBits(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) -1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    /*Set but is 1, This function with count the number of 1's present in the binary number  */
    public static int countSetBits(int n){
        int count = 0;
        while( n> 0) {
            if((n&1) != 0) {
                count++;
            }
            n = n>> 1;
        }
        return count;
    }
    
    public static int fastExpo(int a, int n){
        int ans = 1;
        while( n> 0){
            if( (n&1) != 0){ // check LSB
                ans = ans * a;
            }
             a = a *a;
             n = n >> 1;
        }
        return ans;
    }
    /* The basic concept in fast exponentiation is the we will convert our power in a binary number 
     * The whole operation time is brought down from O(N) to O(log n)
    */

    public static void main(String args[]){
    OddOrEven(3);
    OddOrEven(11);
    OddOrEven(14);

    System.out.println(fastExpo(3, 5));


    /*
     * ===========Operations done=============
     * Odd or even number 
     * Get ith bit
     * Set ith bit 
     * Cleat ith bit
     * update ith bit
     * Clear I bitS
     * Clear Range of I bits
     * If a number is power of 2 or not 
     * Count set bits 
     * fast exponentiation
     * Modular Exponentiation
     */

     /*
      * Extra Questions:
      Question 1: What is the value of x^x for any value of x?
      Question 2: Swap two numbers without using any third variable.
      Question 3: Add 1 to an integer using Bit Manipulation.
      Question 4: Convert uppercase characters to lowercase using bits. 
      */

   } 
}
