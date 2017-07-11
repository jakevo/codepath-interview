public class Solution {
    public int[] nextGreater(int[] A) {
        int check = 0;
        for (int i = 0; i < A.length; i++) {
            check = 0;
            for (int j = i + 1; j < A.length;j++) {
                if (A[j] > A[i]) {
                    A[i] = A[j];
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                A[i] = -1;
            }
        }
        return A;
    }
}
