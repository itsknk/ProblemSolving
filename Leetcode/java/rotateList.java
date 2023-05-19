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
class rotateList {
    public ListNode rotateRight(ListNode head, int k) {
    if (head == null)
        return head;
    int listLength = 1;
    ListNode pt = head;
    while (pt.next != null) {
        listLength++;
        pt = pt.next;
    }

    pt.next = head;
    pt = head;
    for (int i = 0; i < listLength-(k%listLength)-1; i++) {
        pt = pt.next;
    }
    
    head = pt.next;
    pt.next = null;
    return head;

    }
}
