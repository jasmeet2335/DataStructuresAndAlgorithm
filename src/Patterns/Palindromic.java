public class Palindromic {
    public static void palindromicP(int size) {
        for( int i=1; i<=size; i++) {
            int num =i;
            for( int j=1; j<=size+i-1; j++) {
                if(j<size && j<=size-i ) {
                    System.out.print("  ");
                } else {
                        System.out.print(num +" ");
                        if(j<size) {
                            num--;
                        } else {
                            num++;
                        }

                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {

        palindromicP(9);
    }
}
