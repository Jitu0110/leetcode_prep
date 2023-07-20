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
        //Single pointer approach
        if(n==0 || head == null || head.next == null){
            return null;
        }
        int length = 1;
        ListNode temp = head;
        
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        
        int positionToDelete = length - n;
        
        //Corner case
        if (positionToDelete == 0) {
           return head.next; // Return the second node as the new head
        }
        
        ListNode prev = head;
   
        for(int i=1; i<positionToDelete; i++){
            prev = prev.next;
        }
    
        prev.next = prev.next.next;
        
        return head;
        
    }
}

/*
Two pointer approach -> First and second. Second is moved n spaces ahead first, then both first and second are moved till second reaches end. At this point, first is at the node to be deleted.

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp, second = temp;

        while (n > 0) {
            second = second.next;
            n--;
        }

        while (second.next != null) {
            second = second.next;
            first = first.next;
        }

        first.next = first.next.next;
        return temp.next;
    }
}


*/
























