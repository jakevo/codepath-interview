public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

        static int array[];
        static int length;

    public static int kthsmallest(final int[] A, int B) {


        if (A == null || A.length == 0) {
            return -1;
        }
        array = A;
        //length = A.length;
        Arrays.sort(array);

        return array[B - 1];
    }

}
