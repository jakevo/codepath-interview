public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    static int B[];
    public static int longestConsecutive(final int[] A) {
        B = A;
        Arrays.sort(B);


        int count = 1;
        int temp = 0;
        boolean flag = false;
        int max = 0;

        for (int i = 0; i < B.length; i++) {

            if (flag == false) {

                temp = B[i];
                flag = true;
                max = 1;
                continue;
            } else {

                if (B[i] - temp == 1) {
                    count++;
                    temp = B[i];


                } else if ((B[i] - temp) != 0)  {

                    count = 1;
                    temp = B[i];


                }
                if (count > max) {
                    max = count;
                    //count = 0;

                }
            }
        }
        return max;
    }
}
