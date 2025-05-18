import java.util.*;
public class binaryToDecimal {
    
    public static int toDecimal(int num) {
        int pow=0;
        int result=0;
        while(num>0) {
           result += num%10 * (int)Math.pow(2,pow); 
           pow++;
           num=num/10;

        }
        return result;
    }
    public static void main(String args[]) {
        int number=1010100111; 
        int res = toDecimal(number);
        System.out.println(res);
    }   
}

