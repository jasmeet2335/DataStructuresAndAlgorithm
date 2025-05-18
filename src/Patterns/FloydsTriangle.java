public class FloydsTriangle {

    public static void floydTriangle(int size) {
        int num = 1;
        for( int i=0; i<size; i++){
            for(int j=0; j<=i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size=5;
        floydTriangle(size);
    }
}
