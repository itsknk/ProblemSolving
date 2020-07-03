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
class removeNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode last = dummy;
        ListNode current = dummy;
        int count =0;
        while(current!=null){
            if(count > n){
                last = last.next;
            }
            current = current.next;
            count++;
        }
        last.next = last.next.next;
        return dummy.next;
    }
}
