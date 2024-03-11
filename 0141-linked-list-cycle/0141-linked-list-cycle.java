/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //Fast and slow pointer method. They overlap at some point if there is a cycle
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}