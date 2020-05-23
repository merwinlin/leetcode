package _141_linked_list_cycle;

/**
 * 快指针始终在慢指针前面，只需判断fast!=null && fast.next!=null
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next== null){
            return false;
        }
        ListNode a = head.next;
        ListNode b = head.next.next;
        while(b!=null && b.next != null){
            if(a == b){
                return true;
            }
            a = a.next;
            b = b.next.next;
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
