public class InvertedRotatedHalfPyramid {

    public static void invRotateHalfPyramid(int size){
        for(int i=1; i<=size; i++) {
            for(int j=1; j<=size; j++) {
                if(j<=size-i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size = 4;
        invRotateHalfPyramid(size);
    }
}
