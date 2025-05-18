public class diamond {

    public static void diamondP(int size) {
        int mid = size/2+1;
        for(int i=1; i<=size; i++) {
            for(int j=1; j<=mid+i-1 && i<=mid-1; j++) {
                if(i<mid && j<=mid-i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            for(int j=1; j<=size+mid-i && i>=mid ; j++) {
                if(i>mid && j<=i-mid) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int size=9;
        diamondP(size);
    }
}