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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        //Split the list into two halfs
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode temp = right.next;
        //Seperate the two halves
        right.next = null;
        right = temp;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left,right);
        
    }
    
    ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    ListNode merge(ListNode left, ListNode right){
        ListNode temp;
        ListNode temp2;
        if(left.val <= right.val){
            temp = left;
            temp2 = left;
            left = left.next;
        }
        else{
            temp = right;
            temp2 = right;
            right = right.next;
        }
        
        while(left!=null && right!=null){
            if(left.val <= right.val){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        
        if(left == null){
            temp.next = right;
        }
        
        if(right == null){
            temp.next = left;
        }
        
        return temp2;
        
    }
}