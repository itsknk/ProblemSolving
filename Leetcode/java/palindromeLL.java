class palindromeLL {
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            second = second.next.next;
            first = first.next;
        }
        first = reversed(first);
        second = head;
        while(first != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public ListNode reversed(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next=prev;
            prev = head;
            head = next;
        }
       return prev;
    }
}
