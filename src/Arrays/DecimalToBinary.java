import java.util.*;
public class DecimalToBinary {
    
    public static int toBinary(int num) {
        int result=0;
        int pow = 0;
        while( num>0) {
            result += num%2 * Math.pow(10, pow);
            pow++;
            num /= 2;
        }
        return result;
    }
    public static void main(String args[]) {
        int number = 45;
        int res = toBinary(number); 
        System.out.println(res);
    }
}
