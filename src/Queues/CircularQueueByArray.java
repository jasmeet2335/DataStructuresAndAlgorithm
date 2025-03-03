public class CircularQueueByArray {
   static class CircularQueue {
      static int arr[];
      static int size;
      static int rear;

      CircularQueue(int n) {
         arr = new int[n];
         size = n;
         rear = -1;
      }

      public static boolean isEmpty() {
         return rear == -1;
      }

      // add O(1)
      public static void add(int data) {
         if(rear == size-1) {
            System.out.println("Queue is full");
            return;
         }
         rear++;
         arr[rear] = data;
      }

      // remove O(N)
      public static int remove() {
         if(rear == -1) {
            System.out.println("Queue is empty");
         }
         return 0;
      }

      // peek O(1)
   }
   public static int main(String args[]) {

      return 0;
   }
}

//CONTINUE FROM CIRCULAR QUEUE FROM 5 MINTUES AFTER COMPLETING THINGS ON MY OWN.