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
class reorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode l1 = head; //head of the first half
        ListNode prev = head; //tail of the first half
        ListNode a = head; //head of the second half
        ListNode b = head; //tail of the second half
        while(b!=null && b.next!=null){
            prev = a;
            a = a.next;
            b =b.next.next;
        }
        prev.next = null;
        ListNode l2 = reverse(a);
        merge(l1, l2);
    }
        public ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode current = head;
            while(current!=null){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
        public void merge(ListNode l1, ListNode l2){
            while(l1!=null){
                ListNode l1_next = l1.next;
                ListNode l2_next = l2.next;
                l1.next = l2;
                if(l1_next == null){
                    break;
                }
                l2.next = l1_next;
                l1 = l1_next;
                l2 = l2_next;
            }
        }
    
}
