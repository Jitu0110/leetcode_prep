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
 //  Solution using Min Heap(priority queue)
//  Time Complexity:         O(n*log(k))
//  Extra Space Complexity:  O(k)
// public ListNode mergeKLists(ListNode[] lists) {
//         if (lists == null || lists.length == 0) {
//             return null;
//         }

//         PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
//         for (ListNode node : lists) {
//             if (node != null) {
//                 queue.offer(node);
//             }
//         }

//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;

//         while (!queue.isEmpty()) {
//             ListNode node = queue.poll();
//             current.next = node;
//             current = current.next;

//             if (node.next != null) {
//                 queue.offer(node.next);
//             }
//         }

//         return dummy.next;
//     }
    
    
//  Solution using Divide and Conquer - Merge Sort
//  Time Complexity:         O(n*log(k))
//  Extra Space Complexity:  O(1) 
     public ListNode mergeKLists(ListNode[] lists) {
         
         if (lists == null || lists.length == 0) {
           return null;
          }
         
         int size = lists.length;
         int interval = 1;
         
         while(interval < size){
             for(int i = 0; i< size-interval; i = i + 2*interval){
                 lists[i] = Merge(lists[i], lists[i+interval]);
             }
             //Double the interval every iteration
             interval = 2*interval;
         }
         
         return lists[0];
         
}
    //To merge two sorted lists
    public ListNode Merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode curr= dummy;
        
        while(l1!=null && l2!= null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        
        }
        
        if(l1!=null){
            curr.next = l1;
        }
        if(l2!=null){
            curr.next = l2;
        }
        
        return dummy.next;
    }
}