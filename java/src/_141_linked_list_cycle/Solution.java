package _141_linked_list_cycle;

/**
 * Created by Administrator on 2019/4/30.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast,slow;
        if(head == null || head.next == null){
            return false;
        }
        fast = head;
        slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        System.out.println(s.hasCycle(a));
    }
}
