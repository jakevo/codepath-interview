public class Solution {
    public int numRange(int[] A, int B, int C) {

      int single = 0;
      int group = 0;
      int temp = 0;

    for (int x = 0; x < A.length; x++) {
      temp = A[x];
      if (A[x] >= B && A[x] <= C) {
        single++;
      }
      for (int y = x + 1; y < A.length; y++) {
        temp = temp + A[y];
        if (temp >= B && temp <= C) {
          group++;
        }
        if (temp >= C) {
          break;
        }
      }


    }
    return (single + group);
    }
}
