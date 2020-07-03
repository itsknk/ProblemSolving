class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //direct iteration
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
        //Stack approach
        Stack<ListNode> stack = new Stack<ListNode>();
      while(head!=null){
          stack.push(head);
          head = head.next;
      }
        ListNode temp = new ListNode(-1);
        head = temp;
        while(!stack.isEmpty()){
            ListNode current = stack.pop();
            head.next = new ListNode(current.val);
            head = head.next;
        }
        return temp.next;
    }
}
