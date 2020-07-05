package 链表;

public class 奇偶链表 {
    public ListNode oddEvenList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode odd=head,even=head.next,evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;           //这个操作就是为了将odd节点往前移
            even.next=odd.next;
            even=even.next;         //这个操作就是为了将even节点往前移
        }
        odd.next=evenHead;
        return head;
    }

}
