public class HollowRectangle{

    public static void hollowRectangle(int rows, int cols) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=cols; j++) {
                if(j==1 || j==cols || i==1 || i==rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int rows=4, cols=5;
        hollowRectangle(rows, cols);
    }
}