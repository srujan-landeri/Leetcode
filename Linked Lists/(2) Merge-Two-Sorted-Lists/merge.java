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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode dummyHead = result;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                result.next = list1;
                result = result.next;
                list1 = list1.next;
            }
            else{
                result.next = list2;
                result = result.next;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            result.next = list1;
            result = result.next;
            list1 = list1.next;
        }

        while(list2 != null){
            result.next = list2;
            result = result.next;
            list2 = list2.next;
        }

        return dummyHead.next;
    }
}