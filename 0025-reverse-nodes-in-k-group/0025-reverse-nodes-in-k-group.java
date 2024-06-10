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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        
        ListNode groupPrev = dummy;
        
        while(true){
            ListNode kth = getKth(groupPrev,k);
            
            if(kth==null){
                break;
            }
            
            ListNode groupNext = kth.next;
            
            //Reverse group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;
            
            while(curr != groupNext){
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
                
            }
            
            ListNode tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
            
        }
    
        return dummy.next;
        
    }
    
    
    
    ListNode getKth(ListNode node, int k){
        while(node!= null && k>0){
            node = node.next;
            k--;
        }
        
        return node;
    }
}