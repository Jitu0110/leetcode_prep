/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null){
            return null;
        }
        
        HashMap<Node,Node> table = new HashMap<>();
        
        Node temp = head;
        
        //First pass, just create the nodes
        while(temp!=null){
            Node newNode = new Node(temp.val);
            table.put(temp,newNode);
            temp = temp.next;
            
        }
        temp = head;
        Node newHead = table.get(temp);
        
        //Second pass, create the links
        while(temp!=null){
            Node currNode = table.get(temp);
            Node nextNode = table.get(temp.next);
            Node randomNode = table.get(temp.random);
            currNode.next = nextNode;
            currNode.random = randomNode;
            temp = temp.next;
        }
        
        return newHead;
        
    }
}

//Time complexity - O(n), Space complexity - O(n)