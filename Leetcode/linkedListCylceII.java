/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class linkedListCyleII {
    public ListNode detectCycle(ListNode head) {
       boolean flag = false;
        ListNode a = head, b = head;
        while( b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            if (a == b){
                flag = true;
                break;
            }
        }
        
        if (!flag)  return null;
        
        while( a != head ){
            a = a.next;
            head = head.next;
        }
        return a;
    }
}
