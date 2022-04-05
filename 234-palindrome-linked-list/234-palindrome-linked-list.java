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
    public boolean isPalindrome(ListNode head) {
        ListNode head2 = head;
        ListNode back = new ListNode(head2.val);        
        while (head2.next != null){
            back = new ListNode(head2.next.val, back);
            head2 = head2.next;
        }
        
        //compare
        do{
            if (head.val != back.val) return false;
            head = head.next;
            back = back.next;
        } while(head != null);
        return true;
    }
}