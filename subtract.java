/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
       ListNode current = A;
       ListNode something = A;
       ListNode tempCurr = A;

       int length = 0;
       //get length
       while(something.next != null){
           length++;
           something = something.next;
       }


       length += 1;//adding the head
       int middle = length/2;

       int x = 0;

       while (x < middle) {
         x++;
         tempCurr = tempCurr.next;
       }

       //ListNode tempNode = A;
       ListNode currentTemp = reverseList(tempCurr);
       ListNode secondHalf = currentTemp;
       //System.out.println (A);

       for(int i=0; i < middle; i++){

           current.val = secondHalf.val - current.val;
           current = current.next;
           secondHalf = secondHalf.next;
       }
       reverseList(currentTemp);
       //System.out.println(currentTemp);
       //System.out.println(A);
       return A;
    }

    public static ListNode reverseList(ListNode slow) {
		// TODO Auto-generated method stub

		ListNode prev = null;
		ListNode curr = slow;
		ListNode temp;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		slow = prev;
		return slow;
	}
}
