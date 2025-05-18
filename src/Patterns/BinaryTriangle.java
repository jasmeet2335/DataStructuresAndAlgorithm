public class BinaryTriangle {
    
    public static void Triangle01(int size) {
        for( int i=0; i<size; i++) {
            int num = i%2==0 ? 0 : 1;
            for( int j=0; j<=i; j++) {
                num = num==1 ? 0 : 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size=5;
        Triangle01(size);
    }
}
