class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
       ListNode current = head;
       ListNode next = null;
       ListNode prev = null;
        while(current!=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
