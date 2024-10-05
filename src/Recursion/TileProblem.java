package Recursion;

public class TileProblem {
    public static int tilingProblem(int n){
        if( n==0 || n==1 ){
            return 1;
        }
        //vertical choice
        int fn1 = tilingProblem(n-1);

        //horizontal choice
        int fn2 = tilingProblem(n-2);

        int totalWays = fn1 +fn2;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(tilingProblem(4));
    }
}


