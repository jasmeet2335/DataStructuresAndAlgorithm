public class invHalfPyramidNum {

    public static void invHPyramidNum(int size) {
        for(int i=0; i<size; i++) {
            for( int j=0; j<size-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int size=5;
        invHPyramidNum(size);
    }
}