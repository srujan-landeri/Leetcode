// given inputs are in sorted order

// Definition for singly-linked list.

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class remove {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(node == null) return node;
        
        while(node.next!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}