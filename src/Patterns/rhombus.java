public class rhombus {

    public static void rhombusPattern(int size) {
        for( int i=0; i<size; i++) {
            for( int j=1; j<size-i; j++) {
                System.out.print("  ");
            }
            for( int j=0; j<size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size=10;
        rhombusPattern(size);
    }
}
