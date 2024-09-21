package BitManipulation;

public class intro {
    /*
     * Bitwise Operators 
     * Binary AND &
     * Binary OR |
     * Binary XOR ^
     * Binary One's Complement ~
     * Binary Left Shift <<
     * Binary Right Shift >>
     */

     /*
      * Rules for Binary AND &
      0 & 0 = 0
      0 & 1 = 0
      1 & 0 = 0
      1 & 1 = 1
      */

      /*
      * Rules for Binary OR |
      0 & 0 = 0
      0 & 1 = 1
      1 & 0 = 1
      1 & 1 = 1
      */

      /*
      * Rules for Binary XOR ^
      0 & 0 = 0
      0 & 1 = 1
      1 & 0 = 1
      1 & 1 = 0
      */

      /*
      * Rules for Binary One's Complement ~
      ~0 = 1
      ~1 = 0
      In binary we have a least important bit and the most important bit known as LSB and MSB respectively. 
      LSB is the left most bit whereas the MSB is the rightmost bit
      MSB is used to represent the sign of the number, as to if it is positive or negative. 
      To convert a number's one's complement and considering the real world storage we, do this in 2 steps 
      1. We convert a numbers one's complement - to find the magnitude
      2. we add one to it and change the sign of the number 

      For example the ~5 = -6 and ~0 = -1
      */

      /*
       *  Binary Left Shift 
       *  a << b (2) = a * 2^b
       *  0 0 0 1 0 1 -> 0 1 0 1 0 0 
       *  5 << 2 = 20 
       */

       /*
        * Binary Right Shift Operator 
            a >> b = a / 2^b
            0 0 1 0 0 1 0 0 -> 0 0 0 0 1 0 0 1 
            For example 6 >> 1 = 3
        */

}
