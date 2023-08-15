class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)
            return head;
        ListNode start=null,fresh,prev=null;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val<x)
            {
                fresh=new ListNode(ptr.val);
                if(start==null)
                    start=fresh;
                else
                    prev.next=fresh;
                prev=fresh;
            }
        }
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val>=x)
            {
                fresh=new ListNode(ptr.val);
                if(start==null)
                    start=fresh;
                else
                    prev.next=fresh;
                prev=fresh;
            }
        }
        return start;
    }
}