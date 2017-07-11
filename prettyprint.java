public class Solution {
    public int[][] prettyPrint(int A) {
        int temp1 = A;
    int temp2 = A;
    int row = temp1;
    int temp = (A*2) - 1;
    Stack<Integer> stack = new Stack<Integer>();
    int[][] result = new int [A*2-1][A*2-1];
    int copy = 0;

    for (int i = 0; i < row; i++) {
      copy = 0;
      int leftOrRight = temp - ((A*2) - 1);
      //print the left part
      for (int x = 0; x < leftOrRight/2; x++) {
        int holder1 = temp1--;
        if ( i != row -1) {
          stack.push(holder1);
        }
        result [i][copy++] = holder1;


      }
      //print the middle part
      for (int y = 0; y < (A*2) - 1; y++) {
        if ( i != row -1) {
          stack.push(A);
        }
        result [i][copy] = A;
        copy++;
      }
      //print the right part
      for (int y = 0; y < leftOrRight/2; y++) {
        int holder2 = ++temp1;
        if ( i != row -1) {
          stack.push(holder2);
        }
        result [i][copy++] = holder2;
      }

      A--;
      temp1 = temp2;

    }
    int col = row;
    copy = 0;

    while (stack.isEmpty() == false) {
      if (copy == temp) {
        col++;
        copy = 0;
      }
      result [col][copy++] = stack.pop();
    }


    return result;
    }
}
