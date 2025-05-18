public class numberPyramid {
    public static void pyramid(int size) {
        boolean isThere = true;
        int num =1;
        for( int i=1; i<=size; i++) {
            isThere = true;
            for( int j=1; j<=size+i-1; j++) {
                if(j<size && j<=size-i ) {
                    System.out.print("  ");
                } else {
                    if(isThere){
                        System.out.print(num +" ");
                    } else {
                        System.out.print("  ");
                    }
                    isThere = isThere==true ? false: true;
                }
            }
            System.out.println();
            num++;
        }
    }    
    public static void main(String args[]) {
        int size=9;
        pyramid(size);
    }
}