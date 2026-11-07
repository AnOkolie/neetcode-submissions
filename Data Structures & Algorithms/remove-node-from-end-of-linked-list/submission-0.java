/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstPrev = null;
        ListNode firstCurr = head;
        while (firstCurr != null) {
            ListNode next = firstCurr.next;
            firstCurr.next = firstPrev;
            firstPrev = firstCurr;
            firstCurr = next;
        }
        ListNode secondCurr = firstPrev;
        ListNode secondPrev = null;
        int i = 1;
        while (i < n) {
            secondPrev = secondCurr;
            secondCurr = secondCurr.next;
            i++;
        }
        if (secondPrev == null) {
            // System.out.println("is null: " + secondCurr.next.val);
            secondPrev = secondCurr.next;
            firstPrev = secondCurr.next;
            if(firstPrev == null){
                System.out.println("changed to null");
            }
        } else {
            secondPrev.next = secondCurr.next;
        }
        ListNode thirdCurr = firstPrev;
        ListNode thirdPrev = null;
        while (thirdCurr != null) {
            ListNode next = thirdCurr.next;
            thirdCurr.next = thirdPrev;
            thirdPrev = thirdCurr;
            thirdCurr = next;
        }
        return thirdPrev;
    }
}
