public class Butterfly {

    public static void butterfly(int size) {
        int mid1=size/2;
        int mid2 = size/2+1;
        for( int i=1; i<=size; i++) {
            for( int j=1; j<=size; j++) {
                if(j==1 || j==size || (j<=mid1 && i<=mid1 && j<=i) || (j>=mid2 && i<=mid1 && j>size-i) || (j>=mid2 && i>=mid2 && j>=i) || (j<=mid1 && i>=mid2 && j<=size-i+1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size=12;
        butterfly(size);
    }
}
