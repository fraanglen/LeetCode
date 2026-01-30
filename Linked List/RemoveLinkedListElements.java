class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else
            temp=temp.next;    
        }
        temp=head;
        while(temp!=null){
            if(temp.val==val){
                head=head.next;
            }
            temp=temp.next;
        }
        return head;
    }
}