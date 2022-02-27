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
        int og_val=0;
        int no_val=0;
        int i=1;
        while(head!=null)
        {
            og_val=og_val*10+head.val;
            no_val=i*head.val+no_val;
            head=head.next;
            i=i*10;
            
        }
        if(og_val==no_val)
            return true;
        else
            return false;
    }
}