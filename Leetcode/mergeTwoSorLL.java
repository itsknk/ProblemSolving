class mergeTwoSorLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode temp = new ListNode(0);
       ListNode main = temp;
        while(l1 != null && l2!=null){
            if(l1.val < l2.val){
                main.next = l1;
                l1 = l1.next;
            }
            else{
                main.next = l2;
                l2 = l2.next;
            }
            main = main.next;
        }
        if(l1!=null){
            main.next = l1;
            l1 = l1.next;
        }
        else if(l2!=null){
            main.next = l2;
            l2 = l2.next;
        }
        return temp.next;
    }
}
