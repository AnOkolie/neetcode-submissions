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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode currNode = secondHalf;
        ListNode reverseNext = null;
        while(currNode != null){
            ListNode currNext = currNode.next;
            currNode.next = reverseNext;
            reverseNext = currNode;
            currNode = currNext;
        }

        ListNode l1 = head;
        secondHalf = reverseNext;
        while(secondHalf != null){
            ListNode firstNext = l1.next;
            ListNode secondNext = secondHalf.next;

            l1.next = secondHalf;
            secondHalf.next = firstNext;

            l1 = firstNext;
            secondHalf = secondNext;
        }
    

    }
}
