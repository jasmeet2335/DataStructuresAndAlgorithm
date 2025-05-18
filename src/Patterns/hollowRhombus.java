public class hollowRhombus {
    
    public static void hollowRhombusP(int size) {
        for(int i=0; i<size; i++) {
            for( int j=1; j<size-i; j++) {
                System.out.print("  ");
            }
            for( int j=0; j<size; j++) {
                if (i==0 || j==0 || i==size-1 || j==size-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[]) {
        int size=10;
        hollowRhombusP(size);
    }
}
